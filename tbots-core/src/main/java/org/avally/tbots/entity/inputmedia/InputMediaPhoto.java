package org.avally.tbots.entity.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Represents a photo to be sent.
 *
 * @author Dmitry Polishchuk
 */
public class InputMediaPhoto extends TelegramObject implements InputMedia {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("media") private String media;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    //    @formatter:on

    /**
     * Type of the result, must be photo.
     */
    public InputMediaPhoto setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended), pass an HTTP URL
     * for Telegram to get a file from the Internet, or pass "attach://<file_attach_name>" to upload a new one using
     * multipart/form-data under <file_attach_name> name.
     * <a href="https://core.telegram.org/bots/api#sending-files">More info on Sending Files</a>.
     */
    public InputMediaPhoto setMedia(String media) {
        this.media = media;
        return this;
    }

    /**
     * Optional. Caption of the photo to be sent, 0-200 characters.
     */
    public InputMediaPhoto setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send <a href="https://core.telegram.org/bots/api#markdown-style">Markdown</a> or
     * <a href="https://core.telegram.org/bots/api#html-style">HTML</a>, if you want Telegram apps to show
     * <a href="https://core.telegram.org/bots/api#formatting-options">bold, italic, fixed-width text or inline URLs</a>
     * in the media caption.
     */
    public InputMediaPhoto setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaPhoto that = (InputMediaPhoto) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(media, that.media) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, media, caption, parseMode);
    }
}
