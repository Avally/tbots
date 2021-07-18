package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a venue. By default, the venue will be sent by the user. Alternatively,
 * you can use input_message_content to send a message with the specified content instead of the venue.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultVenue extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("title") private String title;
    @JsonProperty("address") private String address;
    @JsonProperty("foursquare_id") private String foursquareId;
    @JsonProperty("foursquare_type") private String foursquareType;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("thumb_width") private Integer thumbWidth;
    @JsonProperty("thumb_height") private Integer thumbHeight;
    //    @formatter:on

    /**
     * Type of the result, must be venue.
     */
    public InlineQueryResultVenue setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 Bytes.
     */
    public InlineQueryResultVenue setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Latitude of the venue location in degrees.
     */
    public InlineQueryResultVenue setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of the venue location in degrees.
     */
    public InlineQueryResultVenue setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Title of the venue.
     */
    public InlineQueryResultVenue setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Address of the venue.
     */
    public InlineQueryResultVenue setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Optional. Foursquare identifier of the venue if known.
     */
    public InlineQueryResultVenue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    /**
     * Optional. Foursquare type of the venue, if known. (For example, “arts_entertainment/default”,
     * “arts_entertainment/aquarium” or “food/icecream”).
     */
    public InlineQueryResultVenue setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultVenue setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the venue.
     */
    public InlineQueryResultVenue setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional. Url of the thumbnail for the result.
     */
    public InlineQueryResultVenue setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Thumbnail width.
     */
    public InlineQueryResultVenue setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }

    /**
     * Optional. Thumbnail height.
     */
    public InlineQueryResultVenue setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultVenue that = (InlineQueryResultVenue) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(title, that.title) &&
                Objects.equals(address, that.address) &&
                Objects.equals(foursquareId, that.foursquareId) &&
                Objects.equals(foursquareType, that.foursquareType) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(thumbWidth, that.thumbWidth) &&
                Objects.equals(thumbHeight, that.thumbHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, latitude, longitude, title, address, foursquareId, foursquareType, replyMarkup,
                inputMessageContent, thumbUrl, thumbWidth, thumbHeight);
    }
}
