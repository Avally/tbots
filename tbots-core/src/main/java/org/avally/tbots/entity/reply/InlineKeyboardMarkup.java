package org.avally.tbots.entity.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.InlineKeyboardButton;

import java.util.List;
import java.util.Objects;

/**
 * This object represents an <a href="https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating">inline keyboard</a>
 * that appears right next to the message it belongs to.
 * Note: This will only work in Telegram versions released after 9 April, 2016. Older clients will display
 * unsupported message.
 *
 * @author Dmitry Polishchuk
 */
public class InlineKeyboardMarkup extends TelegramObject implements ReplyMarkup {

    @JsonProperty("inline_keyboard")
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    /**
     * Array of button rows, each represented by an Array of InlineKeyboardButton objects
     */
    public InlineKeyboardMarkup setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineKeyboardMarkup that = (InlineKeyboardMarkup) o;
        return Objects.equals(inlineKeyboard, that.inlineKeyboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inlineKeyboard);
    }
}
