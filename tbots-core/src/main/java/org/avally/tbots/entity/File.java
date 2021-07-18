package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a file ready to be downloaded. The file can be downloaded via the link
 * https://api.telegram.org/file/bot&#60;token&#62;/&#60;file_path&#62;.
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires,
 * a new one can be requested by calling <a href="https://core.telegram.org/bots/api#getfile">getFile</a>.
 * Maximum file size to download is 20 MB.
 *
 * @author Dmitry Polishchuk
 */
public class File extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("file_size") private Integer fileSize;
    @JsonProperty("file_path") private String filePath;
    //    @formatter:on

    /**
     * Unique identifier for this file.
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Optional. File size, if known.
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Optional. File path. Use https://api.telegram.org/file/bot&#60;token&#62;/&#60;file_path&#62; to get the file.
     */
    public String getFilePath() {
        return filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(fileId, file.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
