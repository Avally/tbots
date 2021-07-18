package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a venue.
 *
 * @author Dmitry Polishchuk
 */
public class Venue extends TelegramObject {
    //    @formatter:off
    @JsonProperty("location") private Location location;
    @JsonProperty("title") private String title;
    @JsonProperty("address") private String address;
    @JsonProperty("foursquare_id") private String foursquareId;
    @JsonProperty("foursquare_type") private String foursquareType;
    //    @formatter:on

    /**
     * Venue location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Name of the venue.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Address of the venue.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Optional. Foursquare identifier of the venue.
     */
    public String getFoursquareId() {
        return foursquareId;
    }

    /**
     * Optional. Foursquare type of the venue.
     * (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”).
     */
    public String getFoursquareType() {
        return foursquareType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return Objects.equals(location, venue.location) &&
                Objects.equals(title, venue.title) &&
                Objects.equals(address, venue.address) &&
                Objects.equals(foursquareId, venue.foursquareId) &&
                Objects.equals(foursquareType, venue.foursquareType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, title, address, foursquareId, foursquareType);
    }
}
