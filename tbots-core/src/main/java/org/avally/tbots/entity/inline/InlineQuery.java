package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.Location;
import org.avally.tbots.entity.User;

import java.util.Objects;

/**
 * This object represents an incoming inline query. When the user sends an empty query, your bot could return some
 * default or trending results.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQuery extends TelegramObject {
    //    @formatter:off
    @JsonProperty("id") private String id;
    @JsonProperty("from") private User from;
    @JsonProperty("location") private Location location;
    @JsonProperty("query") private String query;
    @JsonProperty("offset") private String offset;
    //    @formatter:on

    /**
     * Unique identifier for this query.
     */
    public String getId() {
        return id;
    }

    /**
     * Sender.
     */
    public User getFrom() {
        return from;
    }

    /**
     * Optional. Sender location, only for bots that request user location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Text of the query (up to 512 characters).
     */
    public String getQuery() {
        return query;
    }

    /**
     * Offset of the results to be returned, can be controlled by the bot.
     */
    public String getOffset() {
        return offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQuery that = (InlineQuery) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
