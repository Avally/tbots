package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a shipping address.
 *
 * @author Dmitry Polishchuk
 */
//note setters required
public class ShippingAddress extends TelegramObject {
    //    @formatter:off
    @JsonProperty("country_code") private String countryCode;
    @JsonProperty("state") private String state;
    @JsonProperty("city") private String city;
    @JsonProperty("street_line1") private String streetLine1;
    @JsonProperty("street_line2") private String streetLine2;
    @JsonProperty("post_code") private String postCode;
    //    @formatter:on

    /**
     * ISO 3166-1 alpha-2 country code.
     */
    public ShippingAddress setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * State, if applicable.
     */
    public ShippingAddress setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * City.
     */
    public ShippingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * First line for the address.
     */
    public ShippingAddress setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Second line for the address.
     */
    public ShippingAddress setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Address post code.
     */
    public ShippingAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingAddress that = (ShippingAddress) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(state, that.state) &&
                Objects.equals(city, that.city) &&
                Objects.equals(streetLine1, that.streetLine1) &&
                Objects.equals(streetLine2, that.streetLine2) &&
                Objects.equals(postCode, that.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, state, city, streetLine1, streetLine2, postCode);
    }
}
