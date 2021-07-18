package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound).
 * By default, this animated MPEG-4 file will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to common a message with the specified content
 * instead of the animation.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultMpeg4Gif extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("mpeg4_url") private String mpeg4Url;
    @JsonProperty("mpeg4_width") private Integer mpeg4Width;
    @JsonProperty("mpeg4_height") private Integer mpeg4Height;
    @JsonProperty("mpeg4_duration") private Integer mpeg4Duration;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be mpeg4_gif.
     */
    public InlineQueryResultMpeg4Gif setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultMpeg4Gif setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL for the MP4 file. File size must not exceed 1MB.
     */
    public InlineQueryResultMpeg4Gif setMpeg4Url(String mpeg4Url) {
        this.mpeg4Url = mpeg4Url;
        return this;
    }

    /**
     * Optional. Video width.
     */
    public InlineQueryResultMpeg4Gif setMpeg4Width(Integer mpeg4Width) {
        this.mpeg4Width = mpeg4Width;
        return this;
    }

    /**
     * Optional. Video height.
     */
    public InlineQueryResultMpeg4Gif setMpeg4Height(Integer mpeg4Height) {
        this.mpeg4Height = mpeg4Height;
        return this;
    }

    /**
     * Optional. Video duration.
     */
    public InlineQueryResultMpeg4Gif setMpeg4Duration(Integer mpeg4Duration) {
        this.mpeg4Duration = mpeg4Duration;
        return this;
    }

    /**
     * URL of the static thumbnail (jpeg or gif) for the result.
     */
    public InlineQueryResultMpeg4Gif setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the MPEG-4 file to be sent, 0-200 characters.
     */
    public InlineQueryResultMpeg4Gif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultMpeg4Gif setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultMpeg4Gif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the video animation.
     */
    public InlineQueryResultMpeg4Gif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultMpeg4Gif that = (InlineQueryResultMpeg4Gif) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(mpeg4Url, that.mpeg4Url) &&
                Objects.equals(mpeg4Width, that.mpeg4Width) &&
                Objects.equals(mpeg4Height, that.mpeg4Height) &&
                Objects.equals(mpeg4Duration, that.mpeg4Duration) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, mpeg4Url, mpeg4Width, mpeg4Height, mpeg4Duration, thumbUrl, title, caption,
                parseMode, replyMarkup, inputMessageContent);
    }
}
