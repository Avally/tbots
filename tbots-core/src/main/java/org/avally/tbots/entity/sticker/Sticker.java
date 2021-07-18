package org.avally.tbots.entity.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.PhotoSize;

import java.util.Objects;

/**
 * This object represents a sticker.
 *
 * @author Dmitry Polishchuk
 */
//todo check accessors requirements / getters required
public class Sticker extends TelegramObject {
    //    @formatter:off
    @JsonProperty("file_id") private String fileId;
    @JsonProperty("width") private Integer width;
    @JsonProperty("height") private Integer height;
    @JsonProperty("thumb") private PhotoSize thumb;
    @JsonProperty("emoji") private String emoji;
    @JsonProperty("set_name") private String setName;
    @JsonProperty("mask_position") private MaskPosition maskPosition;
    @JsonProperty("file_size") private Integer fileSize;
    //    @formatter:on

    /**
     * Unique identifier for this file.
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sticker width.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sticker height.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Optional. Sticker thumbnail in the .webp or .jpg format.
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * Optional. Emoji associated with the sticker.
     */
    public String getEmoji() {
        return emoji;
    }

    /**
     * Optional. Name of the sticker set to which the sticker belongs.
     */
    public String getSetName() {
        return setName;
    }

    /**
     * Optional. For mask stickers, the position where the mask should be placed.
     */
    public MaskPosition getMaskPosition() {
        return maskPosition;
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
        Sticker sticker = (Sticker) o;
        return Objects.equals(fileId, sticker.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId);
    }
}
