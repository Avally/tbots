package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents one button of the reply keyboard. For simple text buttons String can be used instead of
 * this object to specify text of the button. Optional fields are mutually exclusive.
 * Note: request_contact and request_location options will only work in Telegram versions released
 * after 9 April, 2016. Older clients will ignore them.
 *
 * @author Dmitry Polishchuk
 */
public class KeyboardButton extends TelegramObject {
    //    @formatter:off
    @JsonProperty("text") private String text;
    @JsonProperty("request_contact") private Boolean requestContact;
    @JsonProperty("request_location") private Boolean requestLocation;
    //    @formatter:on

    /**
     * Text of the button. If none of the optional fields are used, it will be sent as a message
     * when the button is pressed
     */
    public KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Optional. If True, the user's phone number will be sent as a contact when the button is pressed. Available in
     * private chats only
     */
    public KeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    /**
     * Optional. If True, the user's current location will be sent when the button is pressed. Available in private
     * chats only
     */
    public KeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyboardButton that = (KeyboardButton) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(requestContact, that.requestContact) &&
                Objects.equals(requestLocation, that.requestLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, requestContact, requestLocation);
    }
}
