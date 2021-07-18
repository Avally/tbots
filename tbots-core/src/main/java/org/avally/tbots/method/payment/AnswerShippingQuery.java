package org.avally.tbots.method.payment;

//todo: check for method response type

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.payment.ShippingOption;
import org.avally.tbots.method.StatusBotMethod;

import java.util.List;

/**
 * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified,
 * the Bot API will send an {@link org.avally.tbots.entity.Update} with a shipping_query field to the bot.
 * Use this method to reply to shipping queries. On success, True is returned.
 *
 * @author Dmitry Polishchuk
 */
public class AnswerShippingQuery extends StatusBotMethod {
    //    @formatter:off
    @JsonProperty("shipping_query_id") private String shippingQueryId;
    @JsonProperty("ok") private Boolean ok;
    @JsonProperty("shipping_options") private List<ShippingOption> shippingOptions;
    @JsonProperty("error_message") private String errorMessage;
//    @formatter:on

    /**
     * Unique identifier for the query to be answered.
     */
    public AnswerShippingQuery setShippingQueryId(String shippingQueryId) {
        this.shippingQueryId = shippingQueryId;
        return this;
    }

    /**
     * Specify True if delivery to the specified address is possible and False if there are any problems
     * (for example, if delivery to the specified address is not possible).
     */
    public AnswerShippingQuery setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Optional. Required if ok is True. A JSON-serialized array of available shipping options.
     */
    public AnswerShippingQuery setShippingOptions(List<ShippingOption> shippingOptions) {
        this.shippingOptions = shippingOptions;
        return this;
    }

    /**
     * Optional. Required if ok is False. Error message in human readable form that explains why it is
     * impossible to complete the order (e.g. "Sorry, delivery to your desired address is unavailable').
     * Telegram will display this message to the user.
     */
    public AnswerShippingQuery setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public String getPath() {
        return "answerShippingQuery";
    }
}
