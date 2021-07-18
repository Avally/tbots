package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a video file stored on the Telegram servers. By default, this video file will be sent
 * by the user with an optional caption. Alternatively, you can use input_message_content to send a message with
 * the specified content instead of the video.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedVideo extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("video_file_id") private String videoFileId;
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be video.
     */
    public InlineQueryResultCachedVideo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedVideo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier for the video file.
     */
    public InlineQueryResultCachedVideo setVideoFileId(String videoFileId) {
        this.videoFileId = videoFileId;
        return this;
    }

    /**
     * Title for the result.
     */
    public InlineQueryResultCachedVideo setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultCachedVideo setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Caption of the video to be sent, 0-200 characters.
     */
    public InlineQueryResultCachedVideo setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedVideo setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedVideo setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the video. This field is required if
     * InlineQueryResultVideo is used to common an HTML-page as a result (e.g., a YouTube video).
     */
    public InlineQueryResultCachedVideo setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedVideo that = (InlineQueryResultCachedVideo) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(videoFileId, that.videoFileId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, videoFileId, title, description, caption, parseMode, replyMarkup,
                inputMessageContent);
    }
}
