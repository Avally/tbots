package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a <a href="https://telegram.org/blog/video-messages-and-telescope">video message</a>
 * (available in Telegram apps as of <a href="https://telegram.org/blog/video-messages-and-telescope">v.4.0</a>).
 *
 * @author Dmitry Polishchuk
 */
public class VideoNote extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("length") private Integer length;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("thumb") private PhotoSize thumb;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique identifier for this file.
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Video width and height as defined by sender.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Duration of the video in seconds as defined by sender.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Optional. Video thumbnail.
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * Optional. File size.
     */
    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoNote videoNote = (VideoNote) o;
        return Objects.equals(fileId, videoNote.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
