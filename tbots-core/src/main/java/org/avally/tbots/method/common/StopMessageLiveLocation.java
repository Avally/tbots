package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;
import org.avally.tbots.method.CompoundBotMethod;
import org.avally.tbots.method.CompoundResponse;

/**
 * Use this method to stop updating a live location message sent by the bot or via the bot (for inline bots)
 * before live_period expires. On success, if the message was sent by the bot, the sent {@link Message} is returned,
 * otherwise True is returned.
 *
 * @author Dmitry Polishchuk
 */
public class StopMessageLiveLocation extends CompoundBotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("message_id") private Integer messageId;
    @JsonProperty("inline_message_id") private String inlineMessageId;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    //    @formatter:on

    /**
     * Optional. Required if inline_message_id is not specified. Unique identifier for the target
     * chat or username of the target channel (in the format @channelusername).
     */
    public StopMessageLiveLocation setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Optional. Required if inline_message_id is not specified. Unique identifier for the target
     * chat or username of the target channel (in the format @channelusername).
     */
    public StopMessageLiveLocation setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Optional. Required if inline_message_id is not specified. Identifier of the sent message.
     */
    public StopMessageLiveLocation setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Optional. Required if chat_id and message_id are not specified. Identifier of the inline message.
     */
    public StopMessageLiveLocation setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    /**
     * Optional. A JSON-serialized object for a new inline keyboard.
     */
    public StopMessageLiveLocation setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "stopMessageLiveLocation";
    }

    @Override
    public TelegramResponse<CompoundResponse<Message>> deserializeResponse(String input) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
