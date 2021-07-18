package org.avally.tbots.entity.inputmedia;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Represents an audio file to be treated as music to be sent.
 *
 * @author Dmitry Polishchuk
 */
public class InputMediaAudio extends TelegramObject implements InputMedia {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("media") private String media;
//    todo: add "thumb" field
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("performer") private String performer;
    @JsonProperty("title") private String title;
//    @formatter:on

    /**
     * Type of the result, must be audio.
     */
    public InputMediaAudio setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * fixme: fix javadoc, add url link
     * File to send. Pass a file_id to send a file that exists on the Telegram servers (recommended),
     * pass an HTTP URL for Telegram to get a file from the Internet, or pass “attach://<file_attach_name>”
     * to upload a new one using multipart/form-data under <file_attach_name> name. More info on Sending Files ».
     */
    public InputMediaAudio setMedia(String media) {
        this.media = media;
        return this;
    }

    /**
     * 	Optional. Caption of the audio to be sent, 0-200 characters.
     */
    public InputMediaAudio setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * fixme: add url links
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InputMediaAudio setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Duration of the audio in seconds.
     */
    public InputMediaAudio setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Optional. Performer of the audio.
     */
    public InputMediaAudio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    /**
     * Optional. Title of the audio.
     */
    public InputMediaAudio setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputMediaAudio that = (InputMediaAudio) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(media, that.media) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(performer, that.performer) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, media, caption, parseMode, duration, performer, title);
    }
}
