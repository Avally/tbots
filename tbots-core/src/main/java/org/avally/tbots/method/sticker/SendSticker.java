package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.reply.ReplyMarkup;
import org.avally.tbots.method.BotMethod;

// todo: not complete

/**
 * Use this method to send .webp stickers. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class SendSticker extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("sticker") private String sticker;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendSticker setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Sticker to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a .webp file from the Internet, or upload a new one using
     * multipart/form-data. More info on Sending Files ».
     */
    public SendSticker setSticker(String sticker) {
        this.sticker = sticker;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendSticker setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendSticker setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendSticker setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendSticker";
    }
}
