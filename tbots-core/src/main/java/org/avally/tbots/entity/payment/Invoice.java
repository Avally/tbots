package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object contains basic information about an invoice.
 *
 * @author Dmitry Polishchuk
 */
//note setters required
public class Invoice extends TelegramObject {
    //    @formatter:off
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("start_parameter") private String startParameter;
    @JsonProperty("currency") private String currency;
    @JsonProperty("total_amount") private Integer totalAmount;
    //    @formatter:on

    /**
     * Product name.
     */
    public Invoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Product description.
     */
    public Invoice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice.
     */
    public Invoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    /**
     * Three-letter ISO 4217 currency code.
     */
    public Invoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public Invoice setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(title, invoice.title) &&
                Objects.equals(description, invoice.description) &&
                Objects.equals(startParameter, invoice.startParameter) &&
                Objects.equals(currency, invoice.currency) &&
                Objects.equals(totalAmount, invoice.totalAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, startParameter, currency, totalAmount);
    }
}
