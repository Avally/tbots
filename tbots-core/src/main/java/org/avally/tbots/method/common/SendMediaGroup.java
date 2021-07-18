package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.Message;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.inputmedia.InputMedia;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;
import java.util.List;

/**
 * Use this method to send a group of photos or videos as an album.
 * On success, an array of the sent {@link Message}s is returned.
 *
 * @author Dmitry Polishchuk
 */
// todo check response
public class SendMediaGroup extends BotMethod<List<Message>> {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("media") private List<InputMedia> media;
    @JsonProperty("disable_notification") private Boolean disableNotification;
    @JsonProperty("reply_to_message_id") private Integer replyToMessageId;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendMediaGroup setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendMediaGroup setChatId(Integer chatId) {
        this.chatId = Integer.toString(chatId);
        return this;
    }

    /**
     * A JSON-serialized array describing photos and videos to be sent, must include 2–10 items.
     */
    public SendMediaGroup setMedia(List<InputMedia> media) {
        this.media = media;
        return this;
    }

    /**
     * Optional. Sends the messages silently. Users will receive a notification with no sound.
     */
    public SendMediaGroup disableNotification(Boolean disableNotification) {
        this.disableNotification = disableNotification;
        return this;
    }

    /**
     * Optional. If the messages are a reply, ID of the original message.
     */
    public SendMediaGroup setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    @Override
    public String getPath() {
        return "sendMediaGroup";
    }

    @Override
    public TelegramResponse<List<Message>> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<List<Message>>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
