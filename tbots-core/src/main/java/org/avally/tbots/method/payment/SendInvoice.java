package org.avally.tbots.method.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.payment.LabeledPrice;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;
import org.avally.tbots.method.BotMethod;

import java.util.List;

/**
 * Use this method to send invoices. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class SendInvoice extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private Integer chatId;
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("payload") private String payload;
    @JsonProperty("provider_token") private String providerToken;
    @JsonProperty("start_parameter") private String startParameter;
    @JsonProperty("currency") private String currency;
    @JsonProperty("prices") private List<LabeledPrice> prices;
    @JsonProperty("provider_data") private String providerData;
    @JsonProperty("photo_url") private String photoUrl;
    @JsonProperty("photo_size") private Integer photoSize;
    @JsonProperty("photo_width") private Integer photoWidth;
    @JsonProperty("photo_height") private Integer photoHeight;
    @JsonProperty("need_name") private Boolean needName;
    @JsonProperty("need_phone_number") private Boolean needPhoneNumber;
    @JsonProperty("need_email") private Boolean needEmail;
    @JsonProperty("need_shipping_address") private Boolean needShippingAddress;
    @JsonProperty("send_phone_number_to_provider") private Boolean sendPhoneNumberToProvider;
    @JsonProperty("send_email_to_provider") private Boolean sendEmailToProvider;
    @JsonProperty("is_flexible") private Boolean isFlexible;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    //    @formatter:on

    /**
     * Unique identifier for the target private chat.
     */
    public SendInvoice setChatId(Integer chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Product name, 1-32 characters.
     */
    public SendInvoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Product description, 1-255 characters.
     */
    public SendInvoice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user,
     * use for your internal processes.
     */
    public SendInvoice setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Payments provider token, obtained via Botfather.
     */
    public SendInvoice setProviderToken(String providerToken) {
        this.providerToken = providerToken;
        return this;
    }

    /**
     * Unique deep-linking parameter that can be used to generate this invoice when used as a start parameter.
     */
    public SendInvoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    /**
     * Three-letter ISO 4217 currency code,
     * see <a href="https://core.telegram.org/bots/payments#supported-currencies">more on currencies</a>.
     */
    public SendInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Price breakdown, a list of components (e.g. product price, tax, discount, delivery cost, delivery tax,
     * bonus, etc.)
     */
    public SendInvoice setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }

    /**
     * Optional. JSON-encoded data about the invoice, which will be shared with the payment provider.
     * A detailed description of required fields should be provided by the payment provider.
     */
    public SendInvoice setProviderData(String providerData) {
        this.providerData = providerData;
        return this;
    }

    /**
     * Optional. URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a
     * service. People like it better when they see what they are paying for.
     */
    public SendInvoice setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }

    /**
     * Optional. Photo size.
     */
    public SendInvoice setPhotoSize(Integer photoSize) {
        this.photoSize = photoSize;
        return this;
    }

    /**
     * Optional. Photo width.
     */
    public SendInvoice setPhotoWidth(Integer photoWidth) {
        this.photoWidth = photoWidth;
        return this;
    }

    /**
     * Optional. Photo height.
     */
    public SendInvoice setPhotoHeight(Integer photoHeight) {
        this.photoHeight = photoHeight;
        return this;
    }

    /**
     * Optional. Pass True, if you require the user's full name to complete the order.
     */
    public SendInvoice setNeedName(Boolean needName) {
        this.needName = needName;
        return this;
    }

    /**
     * Optional. Pass True, if you require the user's phone number to complete the order.
     */
    public SendInvoice setNeedPhoneNumber(Boolean needPhoneNumber) {
        this.needPhoneNumber = needPhoneNumber;
        return this;
    }

    /**
     * Optional. Pass True, if you require the user's email address to complete the order.
     */
    public SendInvoice setNeedEmail(Boolean needEmail) {
        this.needEmail = needEmail;
        return this;
    }

    /**
     * Optional. Pass True, if you require the user's shipping address to complete the order.
     */
    public SendInvoice setNeedShippingAddress(Boolean needShippingAddress) {
        this.needShippingAddress = needShippingAddress;
        return this;
    }

    /**
     * Optional. Pass True, if user's phone number should be sent to provider.
     */
    public SendInvoice setSendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        this.sendPhoneNumberToProvider = sendPhoneNumberToProvider;
        return this;
    }

    /**
     * Optional. Pass True, if user's email address should be sent to provider.
     */
    public SendInvoice setSendEmailToProvider(Boolean sendEmailToProvider) {
        this.sendEmailToProvider = sendEmailToProvider;
        return this;
    }

    /**
     * Optional. Pass True, if the final price depends on the shipping method.
     */
    public SendInvoice setFlexible(Boolean flexible) {
        isFlexible = flexible;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendInvoice setDisableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendInvoice setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. A JSON-serialized object for an inline keyboard. If empty, one 'Pay total price' button will be shown.
     * If not empty, the first button must be a Pay button.
     */
    public SendInvoice setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendInvoice";
    }
}
