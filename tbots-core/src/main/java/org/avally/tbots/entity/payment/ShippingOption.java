package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.List;
import java.util.Objects;

/**
 * This object represents one shipping option.
 *
 * @author Dmitry Polishchuk
 */
//todo check accessors requirements
public class ShippingOption extends TelegramObject {
    //    @formatter:off
    @JsonProperty("id") private String id;
    @JsonProperty("title") private String title;
    @JsonProperty("prices") private List<LabeledPrice> prices;
    //    @formatter:on

    /**
     * Shipping option identifier.
     */
    public ShippingOption setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Option title.
     */
    public ShippingOption setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * List of price portions.
     */
    public ShippingOption setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingOption that = (ShippingOption) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(prices, that.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, prices);
    }
}
