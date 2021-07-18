package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * Use this method to forward messages of any kind. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class ForwardMessage extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("from_chat_id") private String fromChatId;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("message_id") private Integer messageId;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public ForwardMessage setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public ForwardMessage setChatId(Long chatId) {
        this.chatId = Long.toString(chatId);
        return this;
    }

    /**
     * Unique identifier for the chat where the original message was sent (or channel username in the
     * format @channelusername).
     */
    public ForwardMessage setFromChatId(String fromChatId) {
        this.fromChatId = fromChatId;
        return this;
    }

    /**
     * Unique identifier for the chat where the original message was sent (or channel username in the
     * format @channelusername).
     */
    public ForwardMessage setFromChatId(Long fromChatId) {
        this.fromChatId = Long.toString(fromChatId);
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public ForwardMessage disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Message identifier in the chat specified in from_chat_id.
     */
    public ForwardMessage setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    public String getPath() {
        return "forwardMessage";
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
