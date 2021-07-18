package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents one size of a photo or a <a href="https://core.telegram.org/bots/api#document">file</a> /
 * <a href="https://core.telegram.org/bots/api#sticker">sticker</a> thumbnail.
 *
 * @author Dmitry Polishchuk
 */
//todo: Check response object for undocumented fields
public class PhotoSize extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique identifier for this file.
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Photo width.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Photo height.
     */
    public Integer getHeight() {
        return height;
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
        PhotoSize photoSize = (PhotoSize) o;
        return Objects.equals(fileId, photoSize.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
