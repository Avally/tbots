package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.inline.ChosenInlineResult;
import org.avally.tbots.entity.inline.InlineQuery;
import org.avally.tbots.entity.payment.PreCheckoutQuery;
import org.avally.tbots.entity.payment.ShippingQuery;

import java.util.Objects;

/**
 * This object represents an incoming update.
 * At most one of the optional parameters can be present in any given update.
 *
 * @author Dmitry Polishchuk
 */
@SuppressWarnings("WeakerAccess")
public class Update extends TelegramObject {
    public static final String MESSAGE = "message";
    public static final String EDITED_MESSAGE = "edited_message";
    public static final String CHANNEL_POST = "channel_post";
    public static final String EDITED_CHANNEL_POST = "edited_channel_post";
    public static final String INLINE_QUERY = "inline_query";
    public static final String CHOSEN_INLINE_RESULT = "chosen_inline_result";
    public static final String CALLBACK_QUERY = "callback_query";
    public static final String SHIPPING_QUERY = "shipping_query";
    public static final String PRE_CHECKOUT_QUERY = "pre_checkout_query";

    //    @formatter:off
    @JsonProperty("update_id") private Integer updateId;
    @JsonProperty(MESSAGE) private Message message;
    @JsonProperty(EDITED_MESSAGE) private Message editedMessage;
    @JsonProperty(CHANNEL_POST) private Message channelPost;
    @JsonProperty(EDITED_CHANNEL_POST) private Message editedChannelPost;
    @JsonProperty(INLINE_QUERY) private InlineQuery inlineQuery;
    @JsonProperty(CHOSEN_INLINE_RESULT) private ChosenInlineResult chosenInlineResult;
    @JsonProperty(CALLBACK_QUERY) private CallbackQuery callbackQuery;
    @JsonProperty(SHIPPING_QUERY) private ShippingQuery shippingQuery;
    @JsonProperty(PRE_CHECKOUT_QUERY) private PreCheckoutQuery preCheckoutQuery;
    //    @formatter:on

    /**
     * The update‘s unique identifier. Update identifiers start from a certain positive number and increase
     * sequentially. This ID becomes especially handy if you’re using Webhooks, since it allows you to
     * ignore repeated updates or to restore the correct update sequence, should they get out of order.
     * If there are no new updates for at least a week, then identifier of the next update will be chosen
     * randomly instead of sequentially.
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * Optional. New incoming message of any kind — text, photo, sticker, etc.
     */
    public Message getMessage() {
        return message;
    }

    public boolean hasMessage() {
        return message != null;
    }

    /**
     * Optional. New version of a message that is known to the bot and was edited.
     */
    public Message getEditedMessage() {
        return editedMessage;
    }

    public boolean hasEditedMessage() {
        return editedMessage != null;
    }

    /**
     * Optional. New incoming channel post of any kind — text, photo, sticker, etc.
     */
    public Message getChannelPost() {
        return channelPost;
    }

    public boolean hasChannelPost() {
        return channelPost != null;
    }

    /**
     * Optional. New version of a channel post that is known to the bot and was edited.
     */
    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public boolean hasEditedChannelPost() {
        return editedChannelPost != null;
    }

    /**
     * Optional. New incoming inline query.
     */
    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public boolean hasInlineQuery() {
        return inlineQuery != null;
    }

    /**
     * Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
     * Please see our documentation on the feedback collecting for details on how to enable these updates
     * for your bot.
     */
    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public boolean hasChosenInlineResult() {
        return chosenInlineResult != null;
    }

    /**
     * Optional. New incoming callback query.
     */
    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public boolean hasCallbackQuery() {
        return callbackQuery != null;
    }

    /**
     * Optional. New incoming shipping query. Only for invoices with flexible price.
     */
    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public boolean hasShippingQuery() {
        return shippingQuery != null;
    }

    /**
     * Optional. New incoming pre-checkout query. Contains full information about checkout.
     */
    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public boolean hasPreCheckoutQuery() {
        return preCheckoutQuery != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Update update = (Update) o;
        return Objects.equals(updateId, update.updateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId);
    }
}
