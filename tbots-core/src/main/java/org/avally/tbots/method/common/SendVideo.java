package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.reply.ReplyMarkup;
import org.avally.tbots.method.BotMethod;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Use this method to send video files, Telegram clients support mp4 videos
 * (other formats may be sent as {@link org.avally.tbots.entity.Document}).
 * On success, the sent {@link Message} is returned. Bots can currently send video files of up to 50 MB in size,
 * this limit may be changed in the future.
 *
 * @author Dmitry Polishchuk
 */
public class SendVideo extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("video") private String video;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    //todo: add "thumb" field
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("supports_streaming") private Boolean supportsStreaming;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on
    private File newFile;
    private InputStream newStream;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVideo setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVideo setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Video to send. Pass a file_id as String to send a video that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a video from the Internet, or upload a new video
     * using multipart/form-data.
     */
    public SendVideo setVideo(String video) {
        this.video = video;
        return this;
    }

    public SendVideo setNewVideo(File newVideoFile) {
        this.newFile = newVideoFile;
        return this;
    }

    public SendVideo setNewVideo(InputStream newVideoStream) {
        this.newStream = newVideoStream;
        return this;
    }

    /**
     * Optional. Duration of sent video in seconds.
     */
    public SendVideo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Video width.
     */
    public SendVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional. Video height.
     */
    public SendVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional. Video caption (may also be used when resending videos by file_id), 0-200 characters.
     */
    public SendVideo setCaption(String caption) {
        this.caption = caption;
        return this;
    }

//    todo: add url links
    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public SendVideo setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Pass True, if the uploaded video is suitable for streaming.
     */
    public SendVideo setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendVideo disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendVideo setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendVideo setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendVideo";
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

    @Override
    public boolean hasNewData() {
        return newFile != null || newStream != null;
    }

    @Override
    public File getNewFile() {
        return newFile;
    }

    @Override
    public InputStream getNewStream() {
        return newStream;
    }
}
