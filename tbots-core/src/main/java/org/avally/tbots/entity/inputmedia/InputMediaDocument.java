package org.avally.tbots.entity.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Represents a general file to be sent.
 *
 * @author Dmitry Polishchuk
 */
public class InputMediaDocument extends TelegramObject implements InputMedia {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("media") private String media;
//    todo: add "thumb" field
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    //    @formatter:on

    /**
     * Type of the result, must be document.
     */
    public InputMediaDocument setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * fixme: fix javadoc, add url link
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass “attach://<file_attach_name>”
     * to upload a new one using multipart/form-data under <file_attach_name> name. More info on Sending Files »
     */
    public InputMediaDocument setMedia(String media) {
        this.media = media;
        return this;
    }

    /**
     * Optional. Caption of the document to be sent, 0-200 characters.
     */
    public InputMediaDocument setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * fixme: add url links
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InputMediaDocument setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaDocument that = (InputMediaDocument) o;
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
