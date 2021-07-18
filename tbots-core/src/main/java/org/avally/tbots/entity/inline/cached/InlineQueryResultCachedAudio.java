package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to an mp3 audio file stored on the Telegram servers. By default, this audio file will
 * be sent by the user. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the audio.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedAudio extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("audio_file_id") private String audioFileId;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be audio.
     */
    public InlineQueryResultCachedAudio setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedAudio setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier for the audio file.
     */
    public InlineQueryResultCachedAudio setAudioFileId(String audioFileId) {
        this.audioFileId = audioFileId;
        return this;
    }

    /**
     * Optional. Caption, 0-200 characters.
     */
    public InlineQueryResultCachedAudio setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedAudio setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedAudio setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the audio.
     */
    public InlineQueryResultCachedAudio setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedAudio that = (InlineQueryResultCachedAudio) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(audioFileId, that.audioFileId) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, audioFileId, caption, parseMode, replyMarkup, inputMessageContent);
    }
}
