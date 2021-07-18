package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the content of a contact message to be sent as the result of an inline query.
 *
 * @author Dmitry Polishchuk
 */
public class InputContactMessageContent extends InputMessageContent {
    //    @formatter:off
    @JsonProperty("phone_number") private String phoneNumber;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("vcard") private String vcard;
    //    @formatter:on

    /**
     * Contact's phone number.
     */
    public InputContactMessageContent setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Contact's first name.
     */
    public InputContactMessageContent setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Optional. Contact's last name.
     */
    public InputContactMessageContent setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * 	Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes.
     */
    public InputContactMessageContent setVcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputContactMessageContent that = (InputContactMessageContent) o;
        return Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(vcard, that.vcard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, firstName, lastName, vcard);
    }
}
