package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a chat photo.
 *
 * @author Dmitry Polishchuk
 */
public class ChatPhoto extends TelegramObject {
    //    @formatter:off
    @JsonProperty("small_file_id") private String smallFileId;
    @JsonProperty("big_file_id") private String bigFileId;
    //    @formatter:on

    /**
     * Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download
     */
    public String getSmallFileId() {
        return smallFileId;
    }

    /**
     * Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
     */
    public String getBigFileId() {
        return bigFileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPhoto chatPhoto = (ChatPhoto) o;
        return Objects.equals(smallFileId, chatPhoto.smallFileId) &&
                Objects.equals(bigFileId, chatPhoto.bigFileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smallFileId, bigFileId);
    }
}
