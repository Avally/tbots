package org.avally.tbots.entity.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.KeyboardButton;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a <a href="https://core.telegram.org/bots#keyboards">custom keyboard</a> with reply options
 * (see <a href="https://core.telegram.org/bots#keyboards">Introduction to bots</a> for details and examples).
 *
 * @author Dmitry Polishchuk
 */
public class ReplyKeyboardMarkup extends TelegramObject implements ReplyMarkup {
    //    @formatter:off
    @JsonProperty("keyboard") private List<List<KeyboardButton>> keyboard;
    @JsonProperty("resize_keyboard") private Boolean resizeKeyboard;
    @JsonProperty("one_time_keyboard") private Boolean oneTimeKeyboard;
    @JsonProperty("selective") private Boolean selective;
    //    @formatter:on

    /**
     * Array of button rows, each represented by an Array of KeyboardButton objects
     */
    public ReplyKeyboardMarkup setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    /**
     * Optional. Requests clients to resize the keyboard vertically for optimal fit (e.g., make the keyboard smaller
     * if there are just two rows of buttons). Defaults to false, in which case the custom keyboard is always of the
     * same height as the app's standard keyboard.
     */
    public ReplyKeyboardMarkup setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    /**
     * Optional. Requests clients to hide the keyboard as soon as it's been used. The keyboard will still be available,
     * but clients will automatically display the usual letter-keyboard in the chat – the user can press a special
     * button in the input field to see the custom keyboard again. Defaults to false.
     */
    public ReplyKeyboardMarkup setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    /**
     * Optional. Use this parameter if you want to show the keyboard to specific users only. Targets: 1) users that
     * are @mentioned in the text of the {@link org.avally.tbots.entity.Message} object; 2) if the bot's message is a reply (has reply_to_message_id),
     * sender of the original message.
     * Example: A user requests to change the bot‘s language, bot replies to the request with a keyboard to select the
     * new language. Other users in the group don’t see the keyboard.
     */
    public ReplyKeyboardMarkup setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplyKeyboardMarkup that = (ReplyKeyboardMarkup) o;
        return Objects.equals(keyboard, that.keyboard) &&
                Objects.equals(resizeKeyboard, that.resizeKeyboard) &&
                Objects.equals(oneTimeKeyboard, that.oneTimeKeyboard) &&
                Objects.equals(selective, that.selective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyboard, resizeKeyboard, oneTimeKeyboard, selective);
    }
}
