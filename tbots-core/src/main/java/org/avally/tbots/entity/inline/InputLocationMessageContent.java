package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the content of a location message to be sent as the result of an inline query.
 *
 * @author Dmitry Polishchuk
 */
public class InputLocationMessageContent extends InputMessageContent {
    //    @formatter:off
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("live_period") private Integer livePeriod;
    //    @formatter:on

    /**
     * Latitude of the location in degrees.
     */
    public InputLocationMessageContent setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of the location in degrees.
     */
    public InputLocationMessageContent setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
     */
    public InputLocationMessageContent setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputLocationMessageContent that = (InputLocationMessageContent) o;
        return Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(livePeriod, that.livePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, livePeriod);
    }
}
