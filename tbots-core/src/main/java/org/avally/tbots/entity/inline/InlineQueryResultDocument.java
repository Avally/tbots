package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to common a message with the specified content instead of the file.
 * Currently, only .PDF and .ZIP files can be sent using this method.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultDocument extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("document_url") private String documentUrl;
    @JsonProperty("mime_type") private String mimeType;
    @JsonProperty("description") private String description;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("thumb_width") private Integer thumbWidth;
    @JsonProperty("thumb_height") private Integer thumbHeight;
    //    @formatter:on

    /**
     * Type of the result, must be document.
     */
    public InlineQueryResultDocument setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultDocument setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title for the result.
     */
    public InlineQueryResultDocument setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the document to be sent, 0-200 characters.
     */
    public InlineQueryResultDocument setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultDocument setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * A valid URL for the file.
     */
    public InlineQueryResultDocument setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
        return this;
    }

    /**
     * Mime type of the content of the file, either “application/pdf” or “application/zip”.
     */
    public InlineQueryResultDocument setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultDocument setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultDocument setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the file.
     */
    public InlineQueryResultDocument setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional. URL of the thumbnail (jpeg only) for the file.
     */
    public InlineQueryResultDocument setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Thumbnail width.
     */
    public InlineQueryResultDocument setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }

    /**
     * Optional. Thumbnail height.
     */
    public InlineQueryResultDocument setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultDocument that = (InlineQueryResultDocument) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(documentUrl, that.documentUrl) &&
                Objects.equals(mimeType, that.mimeType) &&
                Objects.equals(description, that.description) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(thumbWidth, that.thumbWidth) &&
                Objects.equals(thumbHeight, that.thumbHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, title, caption, parseMode, documentUrl, mimeType, description, replyMarkup,
                inputMessageContent, thumbUrl, thumbWidth, thumbHeight);
    }
}
