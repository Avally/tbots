package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 *
 * @author Dmitry Polishchuk
 */
public class InputVenueMessageContent extends InputMessageContent {
    //    @formatter:off
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("title") private String title;
    @JsonProperty("address") private String address;
    @JsonProperty("foursquare_id") private String foursquareId;
    @JsonProperty("foursquare_type") private String foursquareType;
    //    @formatter:on

    /**
     * Latitude of the venue in degrees.
     */
    public InputVenueMessageContent setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of the venue in degrees.
     */
    public InputVenueMessageContent setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Name of the venue.
     */
    public InputVenueMessageContent setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Address of the venue.
     */
    public InputVenueMessageContent setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Optional. Foursquare identifier of the venue, if known.
     */
    public InputVenueMessageContent setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    /**
     * Optional. Foursquare type of the venue, if known. (For example, “arts_entertainment/default”,
     * “arts_entertainment/aquarium” or “food/icecream”).
     */
    public InputVenueMessageContent setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputVenueMessageContent that = (InputVenueMessageContent) o;
        return Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(title, that.title) &&
                Objects.equals(address, that.address) &&
                Objects.equals(foursquareId, that.foursquareId) &&
                Objects.equals(foursquareType, that.foursquareType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, title, address, foursquareId, foursquareType);
    }
}
