package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Use this method when you need to tell the user that something is happening on the bot's side.
 * The status is set for 5 seconds or less (when a message arrives from your bot, Telegram clients clear its typing
 * status). Returns True on success.
 * Example: The ImageBot needs some time to process a request and upload the image. Instead of sending a text message
 * along the lines of “Retrieving image, please wait…”, the bot may use sendChatAction with action = upload_photo.
 * The user will see a “sending photo” status for the bot.
 * We only recommend using this method when a response from the bot will take a noticeable amount of time to arrive.
 *
 * @author Dmitry Polishchuk
 */
public class SendChatAction extends StatusBotMethod {
    //    @formatter:off
    @JsonProperty("chat_id") private String chatId;
    @JsonProperty("action") private String action;
    //    @formatter:on

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendChatAction setChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * Unique identifier for the target chat or username of the target channel (in the format @channelusername).
     */
    public SendChatAction setChatId(Long chatId) {
        this.chatId = Long.toString(chatId);
        return this;
    }

    /**
     * Type of action to broadcast. Choose one, depending on what the user is about to receive: typing for
     * text messages, upload_photo for photos, record_video or upload_video for videos, record_audio or
     * upload_audio for audio files, upload_document for general files, find_location for location data,
     * record_video_note or upload_video_note for video notes.
     */
    public SendChatAction setAction(String action) {
        this.action = action;
        return this;
    }

    @Override
    public String getPath() {
        return "sendChatAction";
    }
}
