package org.avally.tbots.entity.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * todo: add "thumb" field
 * Represents a video to be sent.
 *
 * @author Dmitry Polishchuk
 */
public class InputMediaVideo extends TelegramObject implements InputMedia {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("media") private String media;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("supports_streaming") private Boolean supportsStreaming;
    //    @formatter:on

    /**
     * Type of the result, must be video.
     */
    public InputMediaVideo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL
     * for Telegram to get a file from the Internet, or pass "attach://<file_attach_name>" to upload a new one using
     * multipart/form-data under <file_attach_name> name.
     * <a href="https://core.telegram.org/bots/api#sending-files">More info on Sending Files</a>.
     */
    public InputMediaVideo setMedia(String media) {
        this.media = media;
        return this;
    }

    /**
     * Optional. Caption of the video to be sent, 0-200 characters.
     */
    public InputMediaVideo setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send <a href="https://core.telegram.org/bots/api#markdown-style">Markdown</a> or
     * <a href="https://core.telegram.org/bots/api#html-style">HTML</a>, if you want Telegram apps to show
     * <a href="https://core.telegram.org/bots/api#formatting-options">bold, italic, fixed-width text or inline URLs</a>
     * in the media caption.
     */
    public InputMediaVideo setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Video width.
     */
    public InputMediaVideo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional. Video height.
     */
    public InputMediaVideo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional. Video duration.
     */
    public InputMediaVideo setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Pass True, if the uploaded video is suitable for streaming.
     */
    public InputMediaVideo setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaVideo that = (InputMediaVideo) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(media, that.media) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(supportsStreaming, that.supportsStreaming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, media, caption, parseMode, width, height, duration, supportsStreaming);
    }
}
