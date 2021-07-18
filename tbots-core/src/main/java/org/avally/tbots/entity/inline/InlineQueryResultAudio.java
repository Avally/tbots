package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to an mp3 audio file. By default, this audio file will be sent by the user. Alternatively,
 * you can use input_message_content to send a message with the specified content instead of the audio.
 * Note: This will only work in Telegram versions released after 9 April, 2016. Older clients will ignore them.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultAudio extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("audio_url") private String audioUrl;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("performer") private String performer;
    @JsonProperty("audio_duration") private Integer audioDuration;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be audio.
     */
    public InlineQueryResultAudio setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultAudio setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL for the audio file.
     */
    public InlineQueryResultAudio setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }

    /**
     * Title.
     */
    public InlineQueryResultAudio setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption, 0-200 characters.
     */
    public InlineQueryResultAudio setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultAudio setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Performer.
     */
    public InlineQueryResultAudio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional. Audio duration in seconds.
     */
    public InlineQueryResultAudio setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultAudio setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the audio.
     */
    public InlineQueryResultAudio setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultAudio that = (InlineQueryResultAudio) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(audioUrl, that.audioUrl) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(performer, that.performer) &&
                Objects.equals(audioDuration, that.audioDuration) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, audioUrl, title, caption, parseMode, performer, audioDuration, replyMarkup,
                inputMessageContent);
    }
}
