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

//todo: add "thumb" field
/**
 * Use this method to send audio files, if you want Telegram clients to display them in the music player.
 * Your audio must be in the .mp3 format. On success, the sent {@link Message} is returned. Bots can currently
 * send audio files of up to 50 MB in size, this limit may be changed in the future.
 * For sending voice messages, use the {@link SendVoice} method instead.
 *
 * @author Dmitry Polishchuk
 */
public class SendAudio extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("audio") private String audio;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("performer") private String performer;
    @JsonProperty("title") private String title;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on
    private File newFile;
    private InputStream newStream;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendAudio setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendAudio setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Audio file to send. Pass a file_id as String to send an audio file that exists on the Telegram servers
     * (recommended), pass an HTTP URL as a String for Telegram to get an audio file from the Internet, or upload a
     * new one using multipart/form-data.
     */
    public SendAudio setAudio(String audio) {
        this.audio = audio;
        return this;
    }

    public SendAudio setNewAudio(File newAudioFile) {
        this.newFile = newAudioFile;
        return this;
    }

    public SendAudio setNewAudio(InputStream newAudioStream) {
        this.newStream = newAudioStream;
        return this;
    }

    /**
     * Optional. Audio caption, 0-200 characters.
     */
    public SendAudio setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    //    fixme: add url links

    /**
     * Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public SendAudio setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Duration of the audio in seconds.
     */
    public SendAudio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Performer.
     */
    public SendAudio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional. Track name.
     */
    public SendAudio setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendAudio disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendAudio setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendAudio setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendAudio";
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
