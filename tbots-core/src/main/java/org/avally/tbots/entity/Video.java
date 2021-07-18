package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a video file.
 *
 * @author Dmitry Polishchuk
 */
public class Video extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("thumb") private PhotoSize thumb;
    @JsonProperty("mime_type") private String mimeType;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique identifier for this file.
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Video width as defined by sender.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Video height as defined by sender.
     */
    public Integer getHeight() {
        return height;
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
     * Optional. Mime type of a file as defined by sender.
     */
    public String getMimeType() {
        return mimeType;
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
        Video video = (Video) o;
        return Objects.equals(fileId, video.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
