package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to a sticker stored on the Telegram servers. By default, this sticker will be sent by the user.
 * Alternatively, you can use input_message_content to send a message with the specified content instead of the sticker.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedSticker extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("sticker_file_id") private String stickerFileId;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be sticker.
     */
    public InlineQueryResultCachedSticker setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedSticker setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier of the sticker.
     */
    public InlineQueryResultCachedSticker setStickerFileId(String stickerFileId) {
        this.stickerFileId = stickerFileId;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedSticker setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the sticker.
     */
    public InlineQueryResultCachedSticker setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedSticker that = (InlineQueryResultCachedSticker) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(stickerFileId, that.stickerFileId) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, stickerFileId, replyMarkup, inputMessageContent);
    }
}
