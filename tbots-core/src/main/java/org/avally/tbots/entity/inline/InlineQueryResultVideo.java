package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a page containing an embedded video player or a video file.
 * By default, this video file will be sent by the user with an optional caption.
 * Alternatively, you can use input_message_content to common a message with the specified content instead of the video.
 * If an InlineQueryResultVideo message contains an embedded video (e.g., YouTube),
 * you must replace its content using input_message_content.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultVideo extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("video_url") private String videoUrl;
    @JsonProperty("mime_type") private String mimeType;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("video_width") private Integer videoWidth;
    @JsonProperty("video_height") private Integer videoHeight;
    @JsonProperty("video_duration") private Integer videoDuration;
    @JsonProperty("description") private String description;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be video.
     */
    public InlineQueryResultVideo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultVideo setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid URL for the embedded video player or video file.
     */
    public InlineQueryResultVideo setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * Mime type of the content of video url, “text/html” or “video/mp4”.
     */
    public InlineQueryResultVideo setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * URL of the thumbnail (jpeg only) for the video.
     */
    public InlineQueryResultVideo setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Title for the result.
     */
    public InlineQueryResultVideo setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the video to be sent, 0-200 characters.
     */
    public InlineQueryResultVideo setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultVideo setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Video width.
     */
    public InlineQueryResultVideo setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }

    /**
     * Optional. Video height.
     */
    public InlineQueryResultVideo setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }

    /**
     * Optional. Video duration in seconds.
     */
    public InlineQueryResultVideo setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }

    /**
     * Optional. Short description of the result.
     */
    public InlineQueryResultVideo setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultVideo setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the video. This field is required if
     * InlineQueryResultVideo is used to common an HTML-page as a result (e.g., a YouTube video).
     */
    public InlineQueryResultVideo setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultVideo that = (InlineQueryResultVideo) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(videoUrl, that.videoUrl) &&
                Objects.equals(mimeType, that.mimeType) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(videoWidth, that.videoWidth) &&
                Objects.equals(videoHeight, that.videoHeight) &&
                Objects.equals(videoDuration, that.videoDuration) &&
                Objects.equals(description, that.description) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, videoUrl, mimeType, thumbUrl, title, caption, parseMode, videoWidth, videoHeight,
                videoDuration, description, replyMarkup, inputMessageContent);
    }
}