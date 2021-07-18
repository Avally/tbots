package org.avally.tbots.entity.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Represents an animation file (GIF or H.264/MPEG-4 AVC video without sound) to be sent.
 *
 * @author Dmitry Polishchuk
 */
public class InputMediaAnimation extends TelegramObject implements InputMedia {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("media") private String media;
//    todo: add "thumb" field
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("duration") private Integer duration;
    //    @formatter:on

    /**
     * Type of the result, must be animation.
     */
    public InputMediaAnimation setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * fixme: fix javadoc, add url link
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass “attach://<file_attach_name>”
     * to upload a new one using multipart/form-data under <file_attach_name> name. More info on Sending Files ».
     */
    public InputMediaAnimation setMedia(String media) {
        this.media = media;
        return this;
    }

    /**
     * Optional. Caption of the animation to be sent, 0-200 characters.
     */
    public InputMediaAnimation setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * fixme: add url links
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InputMediaAnimation setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Animation width.
     */
    public InputMediaAnimation setWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * Optional. Animation height.
     */
    public InputMediaAnimation setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Optional. Animation duration.
     */
    public InputMediaAnimation setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaAnimation that = (InputMediaAnimation) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(media, that.media) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, media, caption, parseMode, width, height, duration);
    }
}
