package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a {@link org.avally.tbots.entity.game.Game}.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultGame extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("game_short_name") private String gameShortName;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    //    @formatter:on

    /**
     * Type of the result, must be game.
     */
    public InlineQueryResultGame setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultGame setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Short name of the game.
     */
    public InlineQueryResultGame setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultGame setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultGame that = (InlineQueryResultGame) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(gameShortName, that.gameShortName) &&
                Objects.equals(replyMarkup, that.replyMarkup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, gameShortName, replyMarkup);
    }
}
