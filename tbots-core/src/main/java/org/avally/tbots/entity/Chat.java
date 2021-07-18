package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a chat.
 *
 * @author Dmitry Polishchuk
 */
public class Chat extends TelegramObject {
    //    @formatter:off
    @JsonProperty("id") private Long id;
    @JsonProperty("type") private String type;
    @JsonProperty("title") private String title;
    @JsonProperty("username") private String username;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    @JsonProperty("all_members_are_administrators") private Boolean allMembersAreAdministrators;
    @JsonProperty("photo") private ChatPhoto photo;
    @JsonProperty("description") private String description;
    @JsonProperty("invite_link") private String inviteLink;
    @JsonProperty("pinned_message") private Message pinnedMessage;
    @JsonProperty("sticker_set_name") private String stickerSetName;
    @JsonProperty("can_set_sticker_set") private Boolean canSetStickerSet;
    //    @formatter:on

    /**
     * Unique identifier for this chat. This number may be greater than 32 bits and some programming
     * languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits,
     * so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
     */
    public Long getId() {
        return id;
    }

    /**
     * Type of chat, can be either “private”, “group”, “supergroup” or “channel”.
     */
    public String getType() {
        return type;
    }

    /**
     * Optional. Title, for supergroups, channels and group chats.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Optional. Username, for private chats, supergroups and channels if available.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Optional. First name of the other party in a private chat.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Optional. Last name of the other party in a private chat.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Optional. True if a group has ‘All Members Are Admins’ enabled.
     */
    public Boolean isAllMembersAreAdministrators() {
        return allMembersAreAdministrators != null && allMembersAreAdministrators;
    }

    /**
     * todo add link to getChat
     * Optional. Chat photo. Returned only in getChat.
     */
    public ChatPhoto getPhoto() {
        return photo;
    }

    /**
     * todo add link to getChat
     * Optional. Description, for supergroups and channel chats. Returned only in getChat.
     */
    public String getDescription() {
        return description;
    }

    /**
     * todo add link to getChat
     * Optional. Chat invite link, for supergroups and channel chats. Returned only in getChat.
     */
    public String getInviteLink() {
        return inviteLink;
    }

    /**
     * todo add link to getChat
     * Optional. Pinned message, for supergroups. Returned only in getChat.
     */
    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    /**
     * todo add link to getChat
     * Optional. For supergroups, name of group sticker set. Returned only in getChat.
     */
    public String getStickerSetName() {
        return stickerSetName;
    }

    /**
     * todo add link to getChat
     * Optional. True, if the bot can change the group sticker set. Returned only in getChat.
     */
    public Boolean canSetStickerSet() {
        return canSetStickerSet != null && canSetStickerSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(id, chat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
