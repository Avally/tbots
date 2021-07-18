package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;
import org.avally.tbots.method.CompoundBotMethod;
import org.avally.tbots.method.CompoundResponse;

/**
 * Use this method to edit live location messages sent by the bot or via the bot (for inline bots).
 * A location can be edited until its live_period expires or editing is explicitly disabled by a call to
 * stopMessageLiveLocation. On success, if the edited message was sent by the bot,
 * the edited {@link Message} is returned, otherwise True is returned.
 *
 * @author Dmitry Polishchuk
 */
public class EditMessageLiveLocation extends CompoundBotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("message_id") private Integer messageId;
    @JsonProperty("inline_message_id") private String inlineMessageId;
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    //    @formatter:on

    /**
     * Optional. Required if inline_message_id is not specified. Unique identifier for the target chat or username
     * of the target channel (in the format @channelusername).
     */
    public EditMessageLiveLocation setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Optional. Required if inline_message_id is not specified. Unique identifier for the target chat or username
     * of the target channel (in the format @channelusername).
     */
    public EditMessageLiveLocation setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Optional. Required if inline_message_id is not specified. Identifier of the sent message.
     */
    public EditMessageLiveLocation setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Optional. Required if chat_id and message_id are not specified. Identifier of the inline message.
     */
    public EditMessageLiveLocation setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    /**
     * Latitude of new location.
     */
    public EditMessageLiveLocation setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of new location.
     */
    public EditMessageLiveLocation setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Optional. A JSON-serialized object for a new inline keyboard.
     */
    public EditMessageLiveLocation setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "editMessageLiveLocation";
    }

    @Override
    public TelegramResponse<CompoundResponse<Message>> deserializeResponse(String input) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
