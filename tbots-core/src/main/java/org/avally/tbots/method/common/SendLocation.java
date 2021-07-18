package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.reply.ReplyMarkup;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * Use this method to send point on the map. On success, the sent {@link Message} is returned.
 *
 * @author Dmitry Polishchuk
 */
public class SendLocation extends BotMethod<Message> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("latitude") private Float latitude;
    @JsonProperty("longitude") private Float longitude;
    @JsonProperty("live_period") private Integer livePeriod;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    @JsonProperty("reply_markup") private ReplyMarkup replyMarkup;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendLocation setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendLocation setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * Latitude of the location.
     */
    public SendLocation setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of the location.
     */
    public SendLocation setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Optional. Period in seconds for which the location will be updated (see Live Locations,
     * should be between 60 and 86400.
     */
    public SendLocation setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    /**
     * Optional. Sends the message silently. Users will receive a notification with no sound.
     */
    public SendLocation disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the message is a reply, ID of the original message.
     */
    public SendLocation setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * Optional. Additional interface options. A JSON-serialized object for an inline keyboard,
     * custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.
     */
    public SendLocation setReplyMarkup(ReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public String getPath() {
        return "sendLocation";
    }

    @Override
    public TelegramResponse<Message> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<Message>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
