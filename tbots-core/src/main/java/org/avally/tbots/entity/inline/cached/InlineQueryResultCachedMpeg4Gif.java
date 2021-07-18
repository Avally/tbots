package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound) stored on the Telegram servers.
 * By default, this animated MPEG-4 file will be sent by the user with an optional caption. Alternatively,
 * you can use input_message_content to send a message with the specified content instead of the animation.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("mpeg4_file_id") private String mpeg4FileId;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be mpeg4_gif.
     */
    public InlineQueryResultCachedMpeg4Gif setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedMpeg4Gif setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier for the MP4 file.
     */
    public InlineQueryResultCachedMpeg4Gif setMpeg4FileId(String mpeg4FileId) {
        this.mpeg4FileId = mpeg4FileId;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultCachedMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the MPEG-4 file to be sent, 0-200 characters.
     */
    public InlineQueryResultCachedMpeg4Gif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedMpeg4Gif setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedMpeg4Gif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the video animation.
     */
    public InlineQueryResultCachedMpeg4Gif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedMpeg4Gif that = (InlineQueryResultCachedMpeg4Gif) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(mpeg4FileId, that.mpeg4FileId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, mpeg4FileId, title, caption, parseMode, replyMarkup, inputMessageContent);
    }
}
