package org.avally.tbots.method.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Once the user has confirmed their payment and shipping details, the Bot API sends the final confirmation in the
 * form of an Update with the field pre_checkout_query. Use this method to respond to such pre-checkout queries.
 * On success, True is returned. Note: The Bot API must receive an answer within 10 seconds after the pre-checkout
 * query was sent.
 *
 * @author Dmitry Polishchuk
 */
public class AnswerPreCheckoutQuery extends StatusBotMethod {
    //    @formatter:off
    @JsonProperty("pre_checkout_query_id") private String preCheckoutQueryId;
    @JsonProperty("ok") private Boolean ok;
    @JsonProperty("error_message") private String errorMessage;
//    @formatter:on

    /**
     * Unique identifier for the query to be answered.
     */
    public AnswerPreCheckoutQuery setPreCheckoutQueryId(String preCheckoutQueryId) {
        this.preCheckoutQueryId = preCheckoutQueryId;
        return this;
    }

    /**
     * Specify True if everything is alright (goods are available, etc.) and the bot is ready to proceed with the order.
     * Use False if there are any problems.
     */
    public AnswerPreCheckoutQuery setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Optional. Required if ok is False. Error message in human readable form that explains the reason for failure
     * to proceed with the checkout (e.g. "Sorry, somebody just bought the last of our amazing black T-shirts
     * while you were busy filling out your payment details. Please choose a different color or garment!").
     * Telegram will display this message to the user.
     */
    public AnswerPreCheckoutQuery setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public String getPath() {
        return "answerPreCheckoutQuery";
    }
}
