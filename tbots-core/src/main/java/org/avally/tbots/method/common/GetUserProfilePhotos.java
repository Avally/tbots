package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.UserProfilePhotos;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * Use this method to get a list of profile pictures for a user. Returns a {@link UserProfilePhotos} object.
 *
 * @author Dmitry Polishchuk
 */
public class GetUserProfilePhotos extends BotMethod<UserProfilePhotos> {
    //    @formatter:off
    @JsonProperty("user_id") private Integer userId;
    @JsonProperty("offset") private Integer offset;
    @JsonProperty("limit") private Integer limit;
    //    @formatter:on

    /**
     * Unique identifier of the target user.
     */
    public GetUserProfilePhotos setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Optional. Sequential number of the first photo to be returned. By default, all photos are returned.
     */
    public GetUserProfilePhotos setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Optional. Limits the number of photos to be retrieved. Values between 1—100 are accepted. Defaults to 100.
     */
    public GetUserProfilePhotos setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String getPath() {
        return "getUserProfilePhotos";
    }

    @Override
    public TelegramResponse<UserProfilePhotos> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<UserProfilePhotos>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }

    }
}
