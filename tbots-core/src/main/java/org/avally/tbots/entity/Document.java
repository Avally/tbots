package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a general file (as opposed to <a href="https://core.telegram.org/bots/api#photosize">photos</a>,
 * <a href="https://core.telegram.org/bots/api#voice">voice messages</a> and
 * <a href="https://core.telegram.org/bots/api#audio">audio files</a>).
 *
 * @author Dmitry Polishchuk
 */
public class Document extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("thumb") private PhotoSize thumb;
    @JsonProperty("file_name") private String fileName;
    @JsonProperty("mime_type") private String mimeType;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique file identifier
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Optional. Document thumbnail as defined by sender
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * Optional. Original filename as defined by sender
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Optional. Mime type of the file as defined by sender
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Optional. File size
     */
    public Integer getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(fileId, document.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
