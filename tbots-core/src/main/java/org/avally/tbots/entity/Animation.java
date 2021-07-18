package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
 *
 * @author Dmitry Polishchuk
 * @since Telegram Bot API v4.0
 */
public class Animation extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("thumb") private PhotoSize thumb;
    @JsonProperty("file_name") private String fileName;
    @JsonProperty("mime_type") private String mimeType;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique file identifier.
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
     * Optional. Animation thumbnail as defined by sender.
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * Optional. Original animation filename as defined by sender.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Optional. MIME type of the file as defined by sender.
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
        Animation animation = (Animation) o;
        return Objects.equals(fileId, animation.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
