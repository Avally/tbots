package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a point on the map.
 *
 * @author Dmitry Polishchuk
 */
public class Location extends TelegramObject {
    //    @formatter:off
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("latitude") private Float latitude;
    //    @formatter:on

    /**
     * Longitude as defined by sender.
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Latitude as defined by sender.
     */
    public Float getLatitude() {
        return latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(longitude, location.longitude) &&
                Objects.equals(latitude, location.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude);
    }
}
