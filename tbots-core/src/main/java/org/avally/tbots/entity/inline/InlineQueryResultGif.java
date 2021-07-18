package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to an animated GIF file.
 * By default, this animated GIF file will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to common a message with the specified content instead
 * of the animation.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultGif extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("gif_url") private String gifUrl;
    @JsonProperty("gif_width") private Integer gifWidth;
    @JsonProperty("gif_height") private Integer gifHeight;
    @JsonProperty("gif_duration")private Integer gifDuration;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be gif.
     */
    public InlineQueryResultGif setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultGif setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL for the GIF file. File size must not exceed 1MB.
     */
    public InlineQueryResultGif setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
        return this;
    }

    /**
     * Optional. Width of the GIF.
     */
    public InlineQueryResultGif setGifWidth(Integer gifWidth) {
        this.gifWidth = gifWidth;
        return this;
    }

    /**
     * Optional. Height of the GIF.
     */
    public InlineQueryResultGif setGifHeight(Integer gifHeight) {
        this.gifHeight = gifHeight;
        return this;
    }

    /**
     * Optional. Duration of the GIF.
     */
    public InlineQueryResultGif setGifDuration(Integer gifDuration) {
        this.gifDuration = gifDuration;
        return this;
    }

    /**
     * URL of the static thumbnail for the result (jpeg or gif).
     */
    public InlineQueryResultGif setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultGif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the GIF file to be sent, 0-200 characters.
     */
    public InlineQueryResultGif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultGif setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultGif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the GIF animation.
     */
    public InlineQueryResultGif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultGif that = (InlineQueryResultGif) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(gifUrl, that.gifUrl) &&
                Objects.equals(gifWidth, that.gifWidth) &&
                Objects.equals(gifHeight, that.gifHeight) &&
                Objects.equals(gifDuration, that.gifDuration) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, gifUrl, gifWidth, gifHeight, gifDuration, thumbUrl, title, caption, parseMode,
                replyMarkup, inputMessageContent);
    }
}
