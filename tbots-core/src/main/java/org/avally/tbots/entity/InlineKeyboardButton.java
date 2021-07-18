package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.game.CallbackGame;

import java.util.Objects;

/**
 * This object represents one button of an inline keyboard. You must use exactly one of the optional fields.
 *
 * @author Dmitry Polishchuk
 */
public class InlineKeyboardButton extends TelegramObject {
    //    @formatter:off
    @JsonProperty("text") private String text;
    @JsonProperty("url") private String url;
    @JsonProperty("callback_data") private String callbackData;
    @JsonProperty("switch_inline_query") private String switchInlineQuery;
    @JsonProperty("switch_inline_query_current_chat") private String switchInlineQueryCurrentChat;
    @JsonProperty("callback_game") private CallbackGame callbackGame;
    @JsonProperty("pay") private Boolean pay;
    //    @formatter:on

    /**
     * Label text on the button.
     */
    public InlineKeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Optional. HTTP url to be opened when button is pressed.
     */
    public InlineKeyboardButton setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Optional. Data to be sent in a <a href="https://core.telegram.org/bots/api#callbackquery">callback query</a> to
     * the bot when button is pressed, 1-64 bytes.
     */
    public InlineKeyboardButton setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Optional. If set, pressing the button will prompt the user to select one of their chats, open that chat and
     * insert the bot‘s username and the specified inline query in the input field. Can be empty, in which case just
     * the bot’s username will be inserted.
     * Note: This offers an easy way for users to start using your bot in
     * <a href="https://core.telegram.org/bots/inline">inline mode</a> when they are currently in a
     * private chat with it. Especially useful when combined with
     * <a href="https://core.telegram.org/bots/api#answerinlinequery">switch_pm…</a> actions – in this case the user
     * will be automatically returned to the chat they switched from, skipping the chat selection screen.
     */
    public InlineKeyboardButton setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
        return this;
    }

    /**
     * Optional. If set, pressing the button will insert the bot‘s username and the specified inline query in the
     * current chat's input field. Can be empty, in which case only the bot’s username will be inserted.
     * This offers a quick way for the user to open your bot in inline mode in the same chat – good for selecting
     * something from multiple options.
     */
    public InlineKeyboardButton setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    /**
     * Optional. Description of the game that will be launched when the user presses the button.
     * NOTE: This type of button must always be the first button in the first row.
     */
    public InlineKeyboardButton setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
        return this;
    }

    /**
     * Optional. Specify True, to send a <a href="https://core.telegram.org/bots/api#payments">Pay button</a>.
     * NOTE: This type of button must always be the first button in the first row.
     */
    public InlineKeyboardButton setPay(Boolean pay) {
        this.pay = pay;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineKeyboardButton that = (InlineKeyboardButton) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(url, that.url) &&
                Objects.equals(callbackData, that.callbackData) &&
                Objects.equals(switchInlineQuery, that.switchInlineQuery) &&
                Objects.equals(switchInlineQueryCurrentChat, that.switchInlineQueryCurrentChat) &&
                Objects.equals(callbackGame, that.callbackGame) &&
                Objects.equals(pay, that.pay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url, callbackData, switchInlineQuery, switchInlineQueryCurrentChat, callbackGame, pay);
    }
}
