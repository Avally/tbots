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
 * Use this method to send audio files, if you want Telegram clients to display the file as a playable voice message.
 * For this to work, your audio must be in an .ogg file encoded with OPUS (other formats may be sent as
 * {@link org.avally.tbots.entity.Audio} or {@link org.avally.tbots.entity.Document}).
 * On success, the sent {@link Message} is returned. Bots can currently send voice messages of up to 50 MB in size,
 * this limit may be changed in the future.
 *
 * @author Dmitry Polishchuk
 */
public class SendVoice extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("voice") private String voice;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on
    private File newFile;
    private InputStream newStream;

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVoice setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendVoice setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Audio file to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using
     * multipart/form-data.
     */
    public SendVoice setVoice(String voice) {
        this.voice = voice;
        return this;
    }

    public SendVoice setNewVoice(File file) {
        this.newFile = file;
        return this;
    }

    public SendVoice setNewVoice(InputStream inputStream) {
        this.newStream = inputStream;
        return this;
    }

    /**
     * Optional. Voice message caption, 0-200 characters.
     */
    public SendVoice setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public SendVoice setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Duration of the voice message in seconds.
     */
    public SendVoice setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendVoice disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendVoice setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard,
     * instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendVoice setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendVoice";
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
