package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.List;
import java.util.Objects;

/**
 * This object represent a user's profile pictures.
 *
 * @author Dmitry Polishchuk
 */
public class UserProfilePhotos extends TelegramObject {
    //    @formatter:off
    @JsonProperty("total_count") private Integer totalCount;
    @JsonProperty("photos") private List<List<PhotoSize>> photos;
    //    @formatter:on

    /**
     * Total number of profile pictures the target user has.
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Requested profile pictures (in up to 4 sizes each).
     */
    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfilePhotos that = (UserProfilePhotos) o;
        return Objects.equals(totalCount, that.totalCount) &&
                Objects.equals(photos, that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, photos);
    }
}
