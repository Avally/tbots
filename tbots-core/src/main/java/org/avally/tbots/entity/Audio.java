package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents an audio file to be treated as music by the Telegram clients.
 *
 * @author Dmitry Polishchuk
 */
public class Audio extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("duration") private Integer duration;
    @JsonProperty("performer") private String performer;
    @JsonProperty("title") private String title;
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
     * Optional. Performer of the audio as defined by sender or by audio tags.
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * Optional. Title of the audio as defined by sender or by audio tags.
     */
    public String getTitle() {
        return title;
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
        Audio audio = (Audio) o;
        return Objects.equals(fileId, audio.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
