package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents an incoming callback query from a callback button in an
 * <a href="https://core.telegram.org/bots#inline-keyboards-and-on-the-fly-updating">inline keyboard</a>. If the button
 * that originated the query was attached to a message sent by the bot, the field message will be present. If the
 * button was attached to a message sent via the bot (in
 * <a href="https://core.telegram.org/bots/api#inline-mode">inline mode</a>), the field inline_message_id will be present.
 * Exactly one of the fields data or game_short_name will be present.
 * NOTE: After the user presses a callback button, Telegram clients will display a progress bar until you call
 * <a href="https://core.telegram.org/bots/api#answercallbackquery">answerCallbackQuery</a>. It is, therefore,
 * necessary to react by calling answerCallbackQuery even if no notification to the user is needed (e.g., without
 * specifying any of the optional parameters).
 *
 * @author Dmitry Polishchuk
 */
public class CallbackQuery extends TelegramObject {
    //    @formatter:off
    @JsonProperty("id") private String id;
    @JsonProperty("from") private User from;
    @JsonProperty("message") private Message message;
    @JsonProperty("inline_message_id") private String inlineMessageId;
    @JsonProperty("chat_instance") private String chatInstance;
    @JsonProperty("data") private String data;
    @JsonProperty("game_short_name") private String gameShortName;
    //    @formatter:on

    /**
     * Unique identifier for this query
     */
    public String getId() {
        return id;
    }

    /**
     * Sender
     */
    public User getFrom() {
        return from;
    }

    /**
     * Optional. Message with the callback button that originated the query. Note that message content and message
     * date will not be available if the message is too old.
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
     */
    public String getInlineMessageId() {
        return inlineMessageId;
    }

    /**
     * Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent.
     * Useful for high scores in <a href="https://core.telegram.org/bots/api#games">games</a>.
     */
    public String getChatInstance() {
        return chatInstance;
    }

    /**
     * Optional. Data associated with the callback button. Be aware that a bad client can common arbitrary data in this
     * field.
     */
    public String getData() {
        return data;
    }

    /**
     * Optional. Short name of a <a href="https://core.telegram.org/bots/api#games">Game</a> to be returned, serves as
     * the unique identifier for the game.
     */
    public String getGameShortName() {
        return gameShortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackQuery that = (CallbackQuery) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
