package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a portion of the price for goods or services.
 *
 * @author Dmitry Polishchuk
 */
//note setters required
public class LabeledPrice extends TelegramObject {
    @JsonProperty("label")
    private String label;
    @JsonProperty("amount")
    private Integer amount;

    /**
     * Portion label.
     */
    public LabeledPrice setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Price of the product in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public LabeledPrice setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabeledPrice that = (LabeledPrice) o;
        return Objects.equals(label, that.label) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, amount);
    }
}
