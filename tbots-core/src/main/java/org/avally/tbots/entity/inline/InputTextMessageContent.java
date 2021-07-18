package org.avally.tbots.entity.inline;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 *
 * @author Dmitry Polishchuk
 */
public class InputTextMessageContent extends InputMessageContent {
    //    @formatter:off
    @JsonProperty("message_text") private String messageText;
    @JsonProperty("parse_mode") private String parseMode;
    @JsonProperty("disable_web_page_preview") private Boolean disableWebPagePreview;
    //    @formatter:on

    /**
     * Text of the message to be sent, 1-4096 characters.
     */
    public InputTextMessageContent setMessageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    /**
     * Optional. Send Markdown or HTML, if you want Telegram apps to show bold, italic,
     * fixed-width text or inline URLs in your bot's message.
     */
    public InputTextMessageContent setParseMode(String parseMode) {
        this.parseMode = parseMode;
        return this;
    }

    /**
     * Optional. Disables link previews for links in the sent message.
     */
    public InputTextMessageContent setDisableWebPagePreview(Boolean disableWebPagePreview) {
        this.disableWebPagePreview = disableWebPagePreview;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputTextMessageContent that = (InputTextMessageContent) o;
        return Objects.equals(messageText, that.messageText) &&
                Objects.equals(parseMode, that.parseMode) &&
                Objects.equals(disableWebPagePreview, that.disableWebPagePreview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageText, parseMode, disableWebPagePreview);
    }
}
