package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a Telegram user or bot.
 *
 * @author Dmitry Polishchuk
 */
public class User extends TelegramObject {
    //    @formatter:off
    @JsonProperty("id") private Integer id;
    @JsonProperty("is_bot") private Boolean isBot;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("username") private String userName;
    @JsonProperty("language_code") private String languageCode;
    //    @formatter:on

    /**
     * Unique identifier for this user or bot.
     */
    public Integer getId() {
        return id;
    }

    /**
     * True, if this user is a bot.
     */
    public Boolean isBot() {
        return isBot != null && isBot;
    }

    /**
     * User's or bot's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Optional. User`s or bot’s last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Optional. User‘s or bot’s username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Optional. <a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag</a> of the user's language.
     */
    public String getLanguageCode() {
        return languageCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
