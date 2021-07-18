package org.avally.tbots.entity.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Upon receiving a message with this object, Telegram clients will remove the current custom keyboard and display the
 * default letter-keyboard. By default, custom keyboards are displayed until a new keyboard is sent by a bot.
 * An exception is made for one-time keyboards that are hidden immediately after the user presses a button (see
 * {@link ReplyKeyboardMarkup}).
 *
 * @author Dmitry Polishchuk
 */
public class ReplyKeyboardRemove extends TelegramObject implements ReplyMarkup {
    //    @formatter:off
    @JsonProperty("remove_keyboard") private Boolean removeKeyboard;
    @JsonProperty("selective") private Boolean selective;
    //    @formatter:on

    /**
     * Requests clients to remove the custom keyboard (user will not be able to summon this keyboard; if you want to
     * hide the keyboard from sight but keep it accessible, use one_time_keyboard in {@link ReplyKeyboardMarkup}).
     */
    public ReplyKeyboardRemove setRemoveKeyboard(Boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
        return this;
    }

    /**
     * Optional. Use this parameter if you want to remove the keyboard for specific users only. Targets: 1) users that
     * are @mentioned in the text of the Message object; 2) if the bot's message is a reply (has reply_to_message_id),
     * sender of the original message.
     * Example: A user votes in a poll, bot returns confirmation message in reply to the vote and removes the keyboard
     * for that user, while still showing the keyboard with poll options to users who haven't voted yet.
     */
    public ReplyKeyboardRemove setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplyKeyboardRemove that = (ReplyKeyboardRemove) o;
        return Objects.equals(removeKeyboard, that.removeKeyboard) &&
                Objects.equals(selective, that.selective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeKeyboard, selective);
    }
}
