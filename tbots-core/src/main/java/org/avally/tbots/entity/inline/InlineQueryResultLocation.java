package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a location on a map. By default, the location will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content
 * instead of the location.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultLocation extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("title") private String title;
    @JsonProperty("live_period") private Integer livePeriod;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    @JsonProperty("thumb_url") private String thumbUrl;
    @JsonProperty("thumb_width") private Integer thumbWidth;
    @JsonProperty("thumb_height") private Integer thumbHeight;
    //    @formatter:on

    /**
     * Type of the result, must be location.
     */
    public InlineQueryResultLocation setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 Bytes.
     */
    public InlineQueryResultLocation setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Location latitude in degrees.
     */
    public InlineQueryResultLocation setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Location longitude in degrees.
     */
    public InlineQueryResultLocation setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Location title.
     */
    public InlineQueryResultLocation setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
     */
    public InlineQueryResultLocation setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultLocation setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the location.
     */
    public InlineQueryResultLocation setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Optional. Url of the thumbnail for the result.
     */
    public InlineQueryResultLocation setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    /**
     * Optional. Thumbnail width.
     */
    public InlineQueryResultLocation setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
        return this;
    }

    /**
     * Optional. Thumbnail height.
     */
    public InlineQueryResultLocation setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultLocation that = (InlineQueryResultLocation) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(title, that.title) &&
                Objects.equals(livePeriod, that.livePeriod) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent) &&
                Objects.equals(thumbUrl, that.thumbUrl) &&
                Objects.equals(thumbWidth, that.thumbWidth) &&
                Objects.equals(thumbHeight, that.thumbHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, latitude, longitude, title, livePeriod, replyMarkup, inputMessageContent,
                thumbUrl, thumbWidth, thumbHeight);
    }
}
