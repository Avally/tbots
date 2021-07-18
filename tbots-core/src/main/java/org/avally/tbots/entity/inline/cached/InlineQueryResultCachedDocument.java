package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a file stored on the Telegram servers. By default, this file will be sent by the user
 * with an optional caption. Alternatively, you can use input_message_content to send a message with the
 * specified content instead of the file.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedDocument extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("title") private String title;
    @JsonProperty("document_file_id") private String documentFileId;
    @JsonProperty("description") private String description;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be document.
     */
    public InlineQueryResultCachedDocument setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedDocument setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title for the result.
     */
    public InlineQueryResultCachedDocument setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * A valid file identifier for the file.
     */
    public InlineQueryResultCachedDocument setDocumentFileId(String documentFileId) {
        this.documentFileId = documentFileId;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultCachedDocument setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Caption of the document to be sent, 0-200 characters.
     */
    public InlineQueryResultCachedDocument setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedDocument setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedDocument setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the file.
     */
    public InlineQueryResultCachedDocument setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedDocument that = (InlineQueryResultCachedDocument) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(documentFileId, that.documentFileId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, title, documentFileId, description, caption, parseMode, replyMarkup,
                inputMessageContent);
    }
}
