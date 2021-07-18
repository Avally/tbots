package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to an article or web page.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultArticle extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("title") private String title;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("url") private String url;
    @JsonProperty("hide_url") private Boolean hideUrl;
    @JsonProperty("description") private String description;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("thumb_width") private Integer thumbWidth;
    @JsonProperty("thumb_height") private Integer thumbHeight;
    //    @formatter:on

    /**
     * Type of the result, must be article.
     */
    public InlineQueryResultArticle setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 Bytes.
     */
    public InlineQueryResultArticle setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title of the result.
     */
    public InlineQueryResultArticle setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Content of the message to be sent.
     */
    public InlineQueryResultArticle setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultArticle setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. URL of the result.
     */
    public InlineQueryResultArticle setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional. Pass True, if you don't want the URL to be shown in the message.
     */
    public InlineQueryResultArticle setHideUrl(Boolean hideUrl) {
        this.hideUrl = hideUrl;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultArticle setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Url of the thumbnail for the result.
     */
    public InlineQueryResultArticle setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Thumbnail width.
     */
    public InlineQueryResultArticle setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }

    /**
     * Optional. Thumbnail height.
     */
    public InlineQueryResultArticle setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultArticle that = (InlineQueryResultArticle) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(inputMessageContent, that.inputMessageContent) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(url, that.url) &&
                Objects.equals(hideUrl, that.hideUrl) &&
                Objects.equals(description, that.description) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(thumbWidth, that.thumbWidth) &&
                Objects.equals(thumbHeight, that.thumbHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, title, inputMessageContent, replyMarkup, url, hideUrl, description, thumbUrl, thumbWidth, thumbHeight);
    }
}
