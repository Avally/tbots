package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 *
 * @author Dmitry Polishchuk
 */
public class MessageEntity {
    //    @formatter:off
    @JsonProperty("type") private String type;
    @JsonProperty("offset") private Integer offset;
    @JsonProperty("length") private Integer length;
    @JsonProperty("url") private String url;
    @JsonProperty("user") private User user;
    //    @formatter:on

    /**
     * Type of the entity. Can be mention (@username), hashtag, bot_command, url, email, bold (bold text),
     * italic (italic text), code (monowidth string), pre (monowidth block), text_link
     * (for clickable text URLs), text_mention
     * (for users <a href="https://telegram.org/blog/edit#new-mentions">without usernames</a>).
     */
    public String getType() {
        return type;
    }

    /**
     * Offset in UTF-16 code units to the start of the entity.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Length of the entity in UTF-16 code units.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Optional. For “text_link” only, url that will be opened after user taps on the text.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Optional. For “text_mention” only, the mentioned user.
     */
    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(offset, that.offset) &&
                Objects.equals(length, that.length) &&
                Objects.equals(url, that.url) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, offset, length, url, user);
    }
}
