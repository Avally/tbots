package org.avally.tbots.entity.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object contains basic information about a successful payment.
 *
 * @author Dmitry Polishchuk
 */
//todo check accessors requirements
public class SuccessfulPayment extends TelegramObject {
    //    @formatter:off
    @JsonProperty("currency") private String currency;
    @JsonProperty("total_amount") private Integer totalAmount;
    @JsonProperty("invoice_payload") private String invoicePayload;
    @JsonProperty("shipping_option_id") private String shippingOptionId;
    @JsonProperty("order_info") private OrderInfo orderInfo;
    @JsonProperty("telegram_payment_charge_id") private String telegramPaymentChargeId;
    @JsonProperty("provider_payment_charge_id") private String providerPaymentChargeId;
    //    @formatter:on

    /**
     * Three-letter ISO 4217 currency code.
     */
    public SuccessfulPayment setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
     * it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */

    public SuccessfulPayment setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Bot specified invoice payload.
     */
    public SuccessfulPayment setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    /**
     * Optional. Identifier of the shipping option chosen by the user.
     */
    public SuccessfulPayment setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
        return this;
    }

    /**
     * Optional. Order info provided by the user.
     */
    public SuccessfulPayment setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }

    /**
     * Telegram payment identifier.
     */
    public SuccessfulPayment setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        return this;
    }

    /**
     * Provider payment identifier.
     */
    public SuccessfulPayment setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuccessfulPayment that = (SuccessfulPayment) o;
        return Objects.equals(currency, that.currency) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(invoicePayload, that.invoicePayload) &&
                Objects.equals(shippingOptionId, that.shippingOptionId) &&
                Objects.equals(orderInfo, that.orderInfo) &&
                Objects.equals(telegramPaymentChargeId, that.telegramPaymentChargeId) &&
                Objects.equals(providerPaymentChargeId, that.providerPaymentChargeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, totalAmount, invoicePayload, shippingOptionId, orderInfo,
                telegramPaymentChargeId, providerPaymentChargeId);
    }
}
