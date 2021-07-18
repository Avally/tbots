package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.Location;
import org.avally.tbots.entity.User;

import java.util.Objects;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 * Note: It is necessary to enable inline feedback via @Botfather in order to receive these objects in updates.
 *
 * @author Dmitry Polishchuk
 */
public class ChosenInlineResult extends TelegramObject {
    //    @formatter:off
    @JsonProperty("result_id") private String resultId;
    @JsonProperty("from") private User from;
    @JsonProperty("location") private Location location;
    @JsonProperty("inline_message_id") private String inlineMessageId;
    @JsonProperty("query") private String query;
    //    @formatter:on

    /**
     * The unique identifier for the result that was chosen.
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * The user that chose the result.
     */
    public User getFrom() {
        return from;
    }

    /**
     * Optional. Sender location, only for bots that require user location.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the
     * message. Will be also received in callback queries and can be used to edit the message.
     */
    public String getInlineMessageId() {
        return inlineMessageId;
    }

    /**
     * The query that was used to obtain the result.
     */
    public String getQuery() {
        return query;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChosenInlineResult that = (ChosenInlineResult) o;
        return Objects.equals(resultId, that.resultId) &&
                Objects.equals(from, that.from) &&
                Objects.equals(location, that.location) &&
                Objects.equals(inlineMessageId, that.inlineMessageId) &&
                Objects.equals(query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultId, from, location, inlineMessageId, query);
    }
}
