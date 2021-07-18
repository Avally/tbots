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
 * As of v.4.0, Telegram clients support rounded square mp4 videos of up to 1 minute long.
 * Use this method to send video messages. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class SendVideoNote extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("video_note") private String videoNote;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("length") private Integer length;
//    todo: add "thumb" field
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on
    private File newFile;
    private InputStream newStream;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVideoNote setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVideoNote setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Video note to send. Pass a file_id as String to send a video note that exists on the Telegram servers
     * (recommended) or upload a new video using multipart/form-data.
     * Sending video notes by a URL is currently unsupported.
     */
    public SendVideoNote setVideoNote(String videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    public SendVideoNote setNewFile(File newVideoNoteFile) {
        this.newFile = newVideoNoteFile;
        return this;
    }

    public SendVideoNote setNewStream(InputStream newVideoNoteStream) {
        this.newStream = newVideoNoteStream;
        return this;
    }

    /**
     * Optional. Duration of sent video in seconds.
     */
    public SendVideoNote setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Video width and height.
     */
    public SendVideoNote setLength(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendVideoNote disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendVideoNote setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendVideoNote setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendVideoNote";
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
