package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a voice recording in an .ogg container encoded with OPUS. By default, this voice recording
 * will be sent by the user. Alternatively, you can use input_message_content to common a message with the specified
 * content instead of the the voice message.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultVoice extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("voice_url") private String voiceUrl;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("voice_duration") private Integer voiceDuration;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be voice.
     */
    public InlineQueryResultVoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultVoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL for the voice recording.
     */
    public InlineQueryResultVoice setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }

    /**
     * Recording title.
     */
    public InlineQueryResultVoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption, 0-200 characters.
     */
    public InlineQueryResultVoice setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultVoice setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Recording duration in seconds.
     */
    public InlineQueryResultVoice setVoiceDuration(Integer voiceDuration) {
        this.voiceDuration = voiceDuration;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultVoice setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the voice recording.
     */
    public InlineQueryResultVoice setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultVoice that = (InlineQueryResultVoice) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(voiceUrl, that.voiceUrl) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(voiceDuration, that.voiceDuration) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, voiceUrl, title, caption, parseMode, voiceDuration, replyMarkup,
                inputMessageContent);
    }
}
