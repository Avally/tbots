package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a photo stored on the Telegram servers. By default, this photo will be sent by the user
 * with an optional caption. Alternatively, you can use input_message_content to send a message with the specified
 * content instead of the photo.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedPhoto extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("photo_file_id") private String photoFileId;
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be photo.
     */
    public InlineQueryResultCachedPhoto setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedPhoto setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier of the photo.
     */
    public InlineQueryResultCachedPhoto setPhotoFileId(String photoFileId) {
        this.photoFileId = photoFileId;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultCachedPhoto setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultCachedPhoto setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Caption of the photo to be sent, 0-200 characters.
     */
    public InlineQueryResultCachedPhoto setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedPhoto setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedPhoto setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the photo.
     */
    public InlineQueryResultCachedPhoto setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedPhoto that = (InlineQueryResultCachedPhoto) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(photoFileId, that.photoFileId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, photoFileId, title, description, caption, parseMode, replyMarkup,
                inputMessageContent);
    }
}
