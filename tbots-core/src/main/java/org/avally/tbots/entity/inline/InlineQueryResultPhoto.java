package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional caption.
 * Alternatively, you can use input_message_content to common a message with the specified content instead of the photo.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultPhoto extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("photo_url") private String photoUrl;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("photo_width") private String photoWidth;
    @JsonProperty("photo_height") private String photoHeight;
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
    public InlineQueryResultPhoto setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultPhoto setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL of the photo. Photo must be in jpeg format. Photo size must not exceed 5MB.
     */
    public InlineQueryResultPhoto setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    /**
     * URL of the thumbnail for the photo.
     */
    public InlineQueryResultPhoto setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Width of the photo.
     */
    public InlineQueryResultPhoto setPhotoWidth(String photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    /**
     * Optional. Height of the photo.
     */
    public InlineQueryResultPhoto setPhotoHeight(String photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultPhoto setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultPhoto setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Caption of the photo to be sent, 0-200 characters.
     */
    public InlineQueryResultPhoto setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultPhoto setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultPhoto setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the photo.
     */
    public InlineQueryResultPhoto setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultPhoto that = (InlineQueryResultPhoto) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(photoUrl, that.photoUrl) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(photoWidth, that.photoWidth) &&
                Objects.equals(photoHeight, that.photoHeight) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, photoUrl, thumbUrl, photoWidth, photoHeight, title, description, caption,
                parseMode, replyMarkup, inputMessageContent);
    }
}
