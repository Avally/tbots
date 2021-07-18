package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Contains information about why a request was unsuccessful.
 *
 * @author Dmitry Polishchuk
 */
public class ResponseParameters extends TelegramObject {
    //    @formatter:off
    @JsonProperty("migrate_to_chat_id") private Long migrateToChatId; // todo check this
    @JsonProperty("retry_after") private Integer retryAfter;
    //    @formatter:on

    /**
     * Optional. The group has been migrated to a supergroup with the specified identifier. This number may be greater
     * than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is
     * smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this
     * identifier.
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * Optional. In case of exceeding flood control, the number of seconds left to wait before the request can
     * be repeated
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseParameters that = (ResponseParameters) o;
        return Objects.equals(migrateToChatId, that.migrateToChatId) &&
                Objects.equals(retryAfter, that.retryAfter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrateToChatId, retryAfter);
    }
}
