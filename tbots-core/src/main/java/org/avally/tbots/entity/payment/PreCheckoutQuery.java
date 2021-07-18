package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.User;

import java.util.Objects;

/**
 * This object contains information about an incoming pre-checkout query.
 *
 * @author Dmitry Polishchuk
 */
//note getters required
public class PreCheckoutQuery {
    //    @formatter:off
    @JsonProperty("id") private String id;
    @JsonProperty("from") private User from;
    @JsonProperty("currency") private String currency;
    @JsonProperty("total_amount") private Integer totalAmount;
    @JsonProperty("invoice_payload") private String invoicePayload;
    @JsonProperty("shipping_option_id") private String shippingOptionId;
    @JsonProperty("order_info") private OrderInfo orderInfo;
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
     * Three-letter ISO 4217 currency code.
     */
    public String getCurrency() {
        return currency;
    }
    /**
     * Total price in the smallest units of the currency (integer, not float/double). For example,
     * for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows
     * the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public Integer getTotalAmount() {
        return totalAmount;
    }

    /**
     * Bot specified invoice payload.
     */
    public String getInvoicePayload() {
        return invoicePayload;
    }

    /**
     * Optional. Identifier of the shipping option chosen by the user.
     */
    public String getShippingOptionId() {
        return shippingOptionId;
    }

    /**
     * Optional. Order info provided by the user.
     */
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreCheckoutQuery that = (PreCheckoutQuery) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(invoicePayload, that.invoicePayload) &&
                Objects.equals(shippingOptionId, that.shippingOptionId) &&
                Objects.equals(orderInfo, that.orderInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, currency, totalAmount, invoicePayload, shippingOptionId, orderInfo);
    }
}
