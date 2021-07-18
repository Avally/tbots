package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.reply.ReplyMarkup;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * Use this method to send phone contacts. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class SendContact extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("phone_number") private String phoneNumber;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("vcard") private String vcard;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendContact setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendContact setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Contact's phone number.
     */
    public SendContact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Contact's first name.
     */
    public SendContact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Optional. Contact's last name.
     */
    public SendContact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
     */
    public SendContact setVcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendContact disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendContact setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove keyboard or to force a reply from the user.
     */
    public SendContact setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendContact";
    }

    @Override
    public TelegramResponse<Message> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<Message>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
