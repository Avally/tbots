package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.User;

import java.util.Objects;

/**
 * This object contains information about an incoming shipping query.
 *
 * @author Dmitry Polishchuk
 */
//note getters required
public class ShippingQuery {
    //    @formatter:off
    @JsonProperty("id") private String id;
    @JsonProperty("from") private User from;
    @JsonProperty("invoice_payload") private String invoicePayload;
    @JsonProperty("shipping_address") private ShippingAddress shippingAddress;
    //    @formatter:on

    /**
     * Unique query identifier.
     */
    public String getId() {
        return id;
    }

    /**
     * User who sent the query.
     */
    public User getFrom() {
        return from;
    }

    /**
     * Bot specified invoice payload.
     */
    public String getInvoicePayload() {
        return invoicePayload;
    }

    /**
     * User specified shipping address.
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingQuery that = (ShippingQuery) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(invoicePayload, that.invoicePayload) &&
                Objects.equals(shippingAddress, that.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, invoicePayload, shippingAddress);
    }
}
