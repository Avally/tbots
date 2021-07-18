package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a voice message stored on the Telegram servers. By default, this voice message will be
 * sent by the user. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the voice message.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedVoice extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("voice_file_id") private String voiceFileId;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be voice.
     */
    public InlineQueryResultCachedVoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedVoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier for the voice message.
     */
    public InlineQueryResultCachedVoice setVoiceFileId(String voiceFileId) {
        this.voiceFileId = voiceFileId;
        return this;
    }

    /**
     * Recording title
     */
    public InlineQueryResultCachedVoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption, 0-200 characters.
     */
    public InlineQueryResultCachedVoice setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedVoice setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedVoice setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the voice recording.
     */
    public InlineQueryResultCachedVoice setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedVoice that = (InlineQueryResultCachedVoice) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(voiceFileId, that.voiceFileId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, voiceFileId, title, caption, parseMode, replyMarkup, inputMessageContent);
    }
}
