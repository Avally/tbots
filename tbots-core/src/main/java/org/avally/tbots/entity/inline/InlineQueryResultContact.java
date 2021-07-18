package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user. Alternatively,
 * you can use input_message_content to send a message with the specified content instead of the contact.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultContact extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("phone_number") private String phoneNumber;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("vcard") private String vcard;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("thumb_width") private Integer thumbWidth;
    @JsonProperty("thumb_height") private Integer thumbHeight;
    //    @formatter:on

    /**
     * Type of the result, must be contact.
     */
    public InlineQueryResultContact setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 Bytes.
     */
    public InlineQueryResultContact setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Contact's phone number.
     */
    public InlineQueryResultContact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Contact's first name.
     */
    public InlineQueryResultContact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Optional. Contact's last name.
     */
    public InlineQueryResultContact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes.
     */
    public InlineQueryResultContact setVcard(String vcard) {
        this.vcard = vcard;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultContact setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the contact.
     */
    public InlineQueryResultContact setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional. Url of the thumbnail for the result.
     */
    public InlineQueryResultContact setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Thumbnail width.
     */
    public InlineQueryResultContact setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }

    /**
     * Optional. Thumbnail height.
     */
    public InlineQueryResultContact setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultContact that = (InlineQueryResultContact) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(vcard, that.vcard) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(thumbWidth, that.thumbWidth) &&
                Objects.equals(thumbHeight, that.thumbHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, phoneNumber, firstName, lastName, vcard, replyMarkup, inputMessageContent,
                thumbUrl, thumbWidth, thumbHeight);
    }
}
