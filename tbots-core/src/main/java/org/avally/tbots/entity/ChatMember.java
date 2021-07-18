package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object contains information about one member of a chat.
 *
 * @author Dmitry Polishchuk
 */
public class ChatMember extends TelegramObject {
    //    @formatter:off
    @JsonProperty("user") private User user;
    @JsonProperty("status") private String status;
    @JsonProperty("until_date") private Integer untilDate;
    @JsonProperty("can_be_edited") private Boolean canBeEdited;
    @JsonProperty("can_change_info") private Boolean canChangeInfo;
    @JsonProperty("can_post_messages") private Boolean canPostMessages;
    @JsonProperty("can_edit_messages") private Boolean canEditMessages;
    @JsonProperty("can_delete_messages") private Boolean canDeleteMessages;
    @JsonProperty("can_invite_users") private Boolean canInviteUsers;
    @JsonProperty("can_restrict_members") private Boolean canRestrictMembers;
    @JsonProperty("can_pin_messages") private Boolean canPinMessages;
    @JsonProperty("can_promote_members") private Boolean canPromoteMembers;
    @JsonProperty("can_send_messages") private Boolean canSendMessages;
    @JsonProperty("can_send_media_messages") private Boolean canSendMediaMessages;
    @JsonProperty("can_send_other_messages") private Boolean canSendOtherMessages;
    @JsonProperty("can_add_web_page_previews") private Boolean canAddWebPagePreviews;
    //    @formatter:on

    /**
     * Information about the user
     */
    public User getUser() {
        return user;
    }

    /**
     * The member's status in the chat. Can be “creator”, “administrator”, “member”, “restricted”, “left” or “kicked”
     * todo: extract member status as enum?
     */
    public String getStatus() {
        return status;
    }

    /**
     * Optional. Restictred and kicked only. Date when restrictions will be lifted for this user, unix time
     */

    public Integer getUntilDate() {
        return untilDate;
    }

    /**
     * Optional. Administrators only. True, if the bot is allowed to edit administrator privileges of that user
     */

    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    /**
     * Optional. Administrators only. True, if the administrator can change the chat title, photo and other settings
     */
    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    /**
     * Optional. Administrators only. True, if the administrator can post in the channel, channels only
     */
    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    /**
     * Optional. Administrators only. True, if the administrator can edit messages of other users and can pin messages,
     * channels only
     */
    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    /**
     * Optional. Administrators only. True, if the administrator can delete messages of other users
     */
    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    /**
     * Optional. Administrators only. True, if the administrator can invite new users to the chat
     */
    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    /**
     * Optional. Administrators only. True, if the administrator can restrict, ban or unban chat members
     */
    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    /**
     * Optional. Administrators only. True, if the administrator can pin messages, supergroups only
     */
    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    /**
     * Optional. Administrators only. True, if the administrator can add new administrators with a subset of his own
     * privileges or demote administrators that he has promoted, directly or indirectly (promoted by administrators
     * that were appointed by the user)
     */
    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    /**
     * Optional. Restricted only. True, if the user can common text messages, contacts, locations and venues
     */
    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    /**
     * Optional. Restricted only. True, if the user can common audios, documents, photos, videos, video notes and voice
     * notes, implies can_send_messages
     */
    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    /**
     * Optional. Restricted only. True, if the user can common animations, games, stickers and use inline bots,
     * implies can_send_media_messages
     */
    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    /**
     * Optional. Restricted only. True, if user may add web page previews to his messages, implies
     * can_send_media_messages
     */
    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMember that = (ChatMember) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(status, that.status) &&
                Objects.equals(untilDate, that.untilDate) &&
                Objects.equals(canBeEdited, that.canBeEdited) &&
                Objects.equals(canChangeInfo, that.canChangeInfo) &&
                Objects.equals(canPostMessages, that.canPostMessages) &&
                Objects.equals(canEditMessages, that.canEditMessages) &&
                Objects.equals(canDeleteMessages, that.canDeleteMessages) &&
                Objects.equals(canInviteUsers, that.canInviteUsers) &&
                Objects.equals(canRestrictMembers, that.canRestrictMembers) &&
                Objects.equals(canPinMessages, that.canPinMessages) &&
                Objects.equals(canPromoteMembers, that.canPromoteMembers) &&
                Objects.equals(canSendMessages, that.canSendMessages) &&
                Objects.equals(canSendMediaMessages, that.canSendMediaMessages) &&
                Objects.equals(canSendOtherMessages, that.canSendOtherMessages) &&
                Objects.equals(canAddWebPagePreviews, that.canAddWebPagePreviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, status, untilDate, canBeEdited, canChangeInfo, canPostMessages, canEditMessages,
                canDeleteMessages, canInviteUsers, canRestrictMembers, canPinMessages, canPromoteMembers,
                canSendMessages, canSendMediaMessages, canSendOtherMessages, canAddWebPagePreviews);
    }
}
