package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This object represents information about an order.
 *
 * @author Dmitry Polishchuk
 */
//note setters required
public class OrderInfo {
    //    @formatter:off
    @JsonProperty("name") private String name;
    @JsonProperty("phone_number") private String phoneNumber;
    @JsonProperty("email") private String email;
    @JsonProperty("shipping_address") private ShippingAddress shippingAddress;
    //    @formatter:on

    /**
     * Optional. User name.
     */
    public OrderInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Optional. User's phone number.
     */
    public OrderInfo setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Optional. User email.
     */
    public OrderInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Optional. User shipping address.
     */
    public OrderInfo setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) o;
        return Objects.equals(name, orderInfo.name) &&
                Objects.equals(phoneNumber, orderInfo.phoneNumber) &&
                Objects.equals(email, orderInfo.email) &&
                Objects.equals(shippingAddress, orderInfo.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, email, shippingAddress);
    }
}
