package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a phone contact.
 *
 * @author Dmitry Polishchuk
 */
public class Contact extends TelegramObject {
    //    @formatter:off
    @JsonProperty("phone_number") private String phoneNumber;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("user_id") private Integer userId;
    @JsonProperty("vcard") private String vcard;
    //    @formatter:on

    /**
     * Contact's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Contact's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Optional. Contact's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Optional. Contact's user identifier in Telegram.
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Optional. Additional data about the contact in the form of a <a href="https://en.wikipedia.org/wiki/VCard">vCard</a>.
     */
    public String getVcard() {
        return vcard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber) &&
                Objects.equals(firstName, contact.firstName) &&
                Objects.equals(lastName, contact.lastName) &&
                Objects.equals(userId, contact.userId) &&
                Objects.equals(vcard, contact.vcard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, firstName, lastName, userId, vcard);
    }
}
