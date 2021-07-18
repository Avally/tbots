package org.avally.tbots.entity.inline.cached;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.inline.InlineQueryResult;
import org.avally.tbots.entity.inline.InputMessageContent;
import org.avally.tbots.entity.reply.InlineKeyboardMarkup;

import java.util.Objects;

/**
 * Represents a link to an animated GIF file stored on the Telegram servers. By default, this animated GIF file
 * will be sent by the user with an optional caption. Alternatively, you can use input_message_content to send a
 * message with specified content instead of the animation.
 *
 * @author Dmitry Polishchuk
 */
public class InlineQueryResultCachedGif extends InlineQueryResult {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("id") private String id;
    @JsonProperty("gif_file_id") private String gifFileId;
    @JsonProperty("title") private String title;
    @JsonProperty("caption") private String caption;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("reply_markup") private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content") private InputMessageContent inputMessageContent;
    //    @formatter:on

    /**
     * Type of the result, must be gif.
     */
    public InlineQueryResultCachedGif setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for this result, 1-64 bytes.
     */
    public InlineQueryResultCachedGif setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A valid file identifier for the GIF file.
     */
    public InlineQueryResultCachedGif setGifFileId(String gifFileId) {
        this.gifFileId = gifFileId;
        return this;
    }

    /**
     * Optional. Title for the result.
     */
    public InlineQueryResultCachedGif setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Optional. Caption of the GIF file to be sent, 0-200 characters.
     */
    public InlineQueryResultCachedGif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in the media caption.
     */
    public InlineQueryResultCachedGif setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Inline keyboard attached to the message.
     */
    public InlineQueryResultCachedGif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    /**
     * Optional. Content of the message to be sent instead of the GIF animation.
     */
    public InlineQueryResultCachedGif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InlineQueryResultCachedGif that = (InlineQueryResultCachedGif) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(id, that.id) &&
                Objects.equals(gifFileId, that.gifFileId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(caption, that.caption) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(replyMarkup, that.replyMarkup) &&
                Objects.equals(inputMessageContent, that.inputMessageContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, gifFileId, title, caption, parseMode, replyMarkup, inputMessageContent);
    }
}
