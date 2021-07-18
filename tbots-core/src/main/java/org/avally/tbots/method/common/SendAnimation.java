package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.reply.ReplyMarkup;
import org.avally.tbots.method.BotMethod;

// todo: not complete

/**
 * Use this method to send animation files (GIF or H.264/MPEG-4 AVC video without sound). On success,
 * the sent {@link Message} is returned. Bots can currently send animation files of up to 50 MB in size,
 * this limit may be changed in the future.
 *
 * @author Dmitry Polishchuk
 */
public class SendAnimation extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("animation") private String animation;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
//    todo: add "thumb" field
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendAnimation setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Animation to send. Pass a file_id as String to send an animation that exists on the Telegram servers
     * (recommended), pass an HTTP URL as a String for Telegram to get an animation from the Internet,
     * or upload a new animation using multipart/form-data. More info on Sending Files ».
     */
    public SendAnimation setAnimation(String animation) {
        this.animation = animation;
        return this;
    }

    /**
     * Optional. Duration of sent animation in seconds.
     */
    public SendAnimation setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Animation width.
     */
    public SendAnimation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional. Animation height.
     */
    public SendAnimation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional. Animation caption (may also be used when resending animation by file_id), 0-200 characters.
     */
    public SendAnimation setCaption(String caption) {
        this.caption = caption;
        return this;
    }

//    fixme: add url links

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic, fixed-width text or inline
     * URLs in the media caption.
     */
    public SendAnimation setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendAnimation setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendAnimation setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendAnimation setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendAnimation";
    }
}
