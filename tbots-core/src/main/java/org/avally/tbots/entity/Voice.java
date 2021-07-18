package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a voice note.
 *
 * @author Dmitry Polishchuk
 */
public class Voice extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("duration") private Integer duration;
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
     * Duration of the audio in seconds as defined by sender.
     */
    public Integer getDuration() {
        return duration;
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
        Voice voice = (Voice) o;
        return Objects.equals(fileId, voice.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
