package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.game.Game;
import org.avally.tbots.entity.passport.PassportData;
import org.avally.tbots.entity.payment.Invoice;
import org.avally.tbots.entity.payment.SuccessfulPayment;
import org.avally.tbots.entity.sticker.Sticker;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a message.
 *
 * @author Dmitry Polishchuk
 */
public class Message extends TelegramObject {
    //    @formatter:off
    @JsonProperty("message_id") private Integer messageId;
    @JsonProperty("from") private User from;
    @JsonProperty("date") private Integer date;
    @JsonProperty("chat") private Chat chat;
    @JsonProperty("forward_from") private User forwardFrom;
    @JsonProperty("forward_from_chat") private Chat forwardFromChat;
    @JsonProperty("forward_from_message_id") private Integer forwardFromMessageId;
    @JsonProperty("forward_signature") private String forwardSignature;
    @JsonProperty("forward_date") private Integer forwardDate; // todo use date/time api?
    @JsonProperty("reply_to_message") private Message replyToMessage;
    @JsonProperty("edit_date") private Integer editDate; // todo use date/time api?
    @JsonProperty("media_group_id") private String mediaGroupId;
    @JsonProperty("author_signature") private String authorSignature;
    @JsonProperty("text") private String text;
    @JsonProperty("entities") private List<MessageEntity> entities;
    @JsonProperty("caption_entities") private List<MessageEntity> captionEntities;
    @JsonProperty("audio") private Audio audio;
    @JsonProperty("document") private Document document;
    @JsonProperty("animation") private Animation animation;
    @JsonProperty("game") private Game game;
    @JsonProperty("photo") private List<PhotoSize> photo;
    @JsonProperty("sticker") private Sticker sticker;
    @JsonProperty("video") private Video video;
    @JsonProperty("voice") private Voice voice;
    @JsonProperty("video_note") private VideoNote videoNote;
    @JsonProperty("caption") private String caption;
    @JsonProperty("contact") private Contact contact;
    @JsonProperty("location") private Location location;
    @JsonProperty("venue") private Venue venue;
    @JsonProperty("new_chat_members") private List<User> newChatMembers;
    @JsonProperty("left_chat_member") private User leftChatMember;
    @JsonProperty("new_chat_title") private String newChatTitle;
    @JsonProperty("new_chat_photo") private List<PhotoSize> newChatPhoto;
    @JsonProperty("delete_chat_photo") private Boolean deleteChatPhoto;
    @JsonProperty("group_chat_created") private Boolean groupChatCreated;
    @JsonProperty("supergroup_chat_created") private Boolean superGroupCreated;
    @JsonProperty("channel_chat_created") private Boolean channelChatCreated;
    @JsonProperty("migrate_to_chat_id") private Long migrateToChatId;
    @JsonProperty("migrate_from_chat_id") private Long migrateFromChatId;
    @JsonProperty("pinned_message") private Message pinnedMessage;
    @JsonProperty("invoice") private Invoice invoice;
    @JsonProperty("successful_payment") private SuccessfulPayment successfulPayment;
    @JsonProperty("connected_website") private String connectedWebsite;
    @JsonProperty("passport_data") private PassportData passportData;
    //    @formatter:on

    /**
     * Unique message identifier inside this chat.
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * Optional. Sender, empty for messages sent to channels.
     */
    public User getFrom() {
        return from;
    }

    public boolean hasFrom() {
        return from != null;
    }

    /**
     * Date the message was sent in Unix time.
     */
    public Integer getDate() {
        return date;
    }

    /**
     * Conversation the message belongs to.
     */
    public Chat getChat() {
        return chat;
    }

    /**
     * Optional. For forwarded messages, sender of the original message.
     */
    public User getForwardFrom() {
        return forwardFrom;
    }

    public boolean hasForwardFrom() {
        return forwardFrom != null;
    }

    /**
     * Optional. For messages forwarded from channels, information about the original channel.
     */
    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public boolean hasForwardFromChat() {
        return forwardFromChat != null;
    }

    /**
     * Optional. For messages forwarded from channels, identifier of the original message in the channel.
     */
    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public boolean hasForwardFromMessageId() {
        return forwardFromMessageId != null;
    }

    /**
     * Optional. For messages forwarded from channels, signature of the post author if present.
     */
    public String getForwardSignature() {
        return forwardSignature;
    }

    public boolean hasForwardSignature() {
        return forwardSignature != null;
    }

    /**
     * Optional. For forwarded messages, date the original message was sent in Unix time.
     */
    public Integer getForwardDate() {
        return forwardDate;
    }

    public boolean hasForwardDate() {
        return forwardDate != null;
    }

    /**
     * Optional. For replies, the original message. Note that the Message object in this field will not
     * contain further reply_to_message fields even if it itself is a reply.
     */
    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public boolean hasReplyToMessage() {
        return replyToMessage != null;
    }

    /**
     * Optional. Date the message was last edited in Unix time.
     */
    public Integer getEditDate() {
        return editDate;
    }

    public boolean hasEditDate() {
        return editDate != null;
    }

    /**
     * Optional. The unique identifier of a media message group this message belongs to.
     */
    public String getMediaGroupId() {
        return mediaGroupId;
    }

    public boolean hasMediaGroupId() {
        return mediaGroupId != null;
    }

    /**
     * Optional. Signature of the post author for messages in channels.
     */
    public String getAuthorSignature() {
        return authorSignature;
    }

    public boolean hasAuthorSignature() {
        return authorSignature != null;
    }

    /**
     * Optional. For text messages, the actual UTF-8 text of the message, 0-4096 characters.
     */
    public String getText() {
        return text;
    }

    public boolean hasText() {
        return text != null;
    }

    /**
     * Optional. For text messages, special entities like usernames, URLs, bot commands, etc. that appear
     * in the text.
     */
    public List<MessageEntity> getEntities() {
        return entities;
    }

    public boolean hasEntities() {
        return entities != null && entities.size() > 0;
    }

    /**
     * Optional. For messages with a caption, special entities like usernames, URLs, bot commands, etc.
     * that appear in the caption.
     */
    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public boolean hasCaptionEntities() {
        return captionEntities != null && captionEntities.size() > 0;
    }

    /**
     * Optional. Message is an audio file, information about the file.
     */
    public Audio getAudio() {
        return audio;
    }

    public boolean hasAudio() {
        return audio != null;
    }

    /**
     * Optional. Message is a general file, information about the file.
     */
    public Document getDocument() {
        return document;
    }

    public boolean hasDocument() {
        return document != null;
    }

    /**
     * Optional. Message is an animation, information about the animation.
     * For backward compatibility, when this field is set, the document field will also be set.
     */
    public Animation getAnimation() {
        return animation;
    }

    public boolean hasAnimation() {
        return animation != null;
    }

    /**
     * Optional. Message is a game, information about the game.
     * <a href="https://core.telegram.org/bots/api#games">More about games</a>.
     */
    public Game getGame() {
        return game;
    }

    public boolean hasGame() {
        return game != null;
    }

    /**
     * Optional. Message is a photo, available sizes of the photo.
     */
    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public boolean hasPhoto() {
        return photo != null && photo.size() > 0;
    }

    /**
     * Optional. Message is a sticker, information about the sticker.
     */
    public Sticker getSticker() {
        return sticker;
    }

    public boolean hasSticker() {
        return sticker != null;
    }

    /**
     * Optional. Message is a video, information about the video.
     */
    public Video getVideo() {
        return video;
    }

    public boolean hasVideo() {
        return video != null;
    }

    /**
     * Optional. Message is a voice message, information about the file.
     */
    public Voice getVoice() {
        return voice;
    }

    public boolean hasVoice() {
        return voice != null;
    }

    /**
     * Optional. Message is a <a href="https://telegram.org/blog/video-messages-and-telescope">video note</a>,
     * information about the video message.
     */
    public VideoNote getVideoNote() {
        return videoNote;
    }

    public boolean hasVideoNote() {
        return videoNote != null;
    }

    /**
     * Optional. Caption for the audio, document, photo, video or voice, 0-200 characters.
     */
    public String getCaption() {
        return caption;
    }

    public boolean hasCaption() {
        return caption != null;
    }

    /**
     * Optional. Message is a shared contact, information about the contact.
     */
    public Contact getContact() {
        return contact;
    }

    public boolean hasContact() {
        return contact != null;
    }

    /**
     * Optional. Message is a shared location, information about the location.
     */
    public Location getLocation() {
        return location;
    }

    public boolean hasLocation() {
        return location != null;
    }

    /**
     * Optional. Message is a venue, information about the venue.
     */
    public Venue getVenue() {
        return venue;
    }

    public boolean hasVenue() {
        return venue != null;
    }

    /**
     * Optional. New members that were added to the group or supergroup and information about them
     * (the bot itself may be one of these members).
     */
    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public boolean hasNewChatMembers() {
        return newChatMembers != null && newChatMembers.size() > 0;
    }

    /**
     * Optional. A member was removed from the group, information about them
     * (this member may be the bot itself).
     */
    public User getLeftChatMember() {
        return leftChatMember;
    }

    public boolean hasLeftChatMember() {
        return leftChatMember != null;
    }

    /**
     * Optional. A chat title was changed to this value.
     */
    public String getNewChatTitle() {
        return newChatTitle;
    }

    public boolean hasNewChatTitle() {
        return newChatTitle != null;
    }

    /**
     * Optional. A chat photo was change to this value.
     */
    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public boolean hasNewChatPhoto() {
        return newChatPhoto != null && newChatPhoto.size() > 0;
    }

    /**
     * Optional. Service message: the chat photo was deleted.
     */
    public boolean hasDeleteChatPhoto() {
        return deleteChatPhoto != null && deleteChatPhoto;
    }

    /**
     * Optional. Service message: the group has been created.
     */
    public boolean hasGroupChatCreated() {
        return groupChatCreated != null && groupChatCreated;
    }

    /**
     * Optional. Service message: the supergroup has been created. This field can‘t be received in a
     * message coming through updates, because bot can’t be a member of a supergroup when it is created.
     * It can only be found in reply_to_message if someone replies to a very first message in a directly
     * created supergroup.
     */
    public boolean hasSuperGroupCreated() {
        return superGroupCreated != null && superGroupCreated;
    }

    /**
     * Optional. Service message: the channel has been created. This field can‘t be received in a message
     * coming through updates, because bot can’t be a member of a channel when it is created. It can only
     * be found in reply_to_message if someone replies to a very first message in a channel.
     */
    public boolean hasChannelChatCreated() {
        return channelChatCreated != null && channelChatCreated;
    }

    /**
     * Optional. The group has been migrated to a supergroup with the specified identifier. This number
     * may be greater than 32 bits and some programming languages may have difficulty/silent defects in
     * interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision
     * float type are safe for storing this identifier.
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public boolean hasMigrateToChatId() {
        return migrateToChatId != null;
    }

    /**
     * Optional. The supergroup has been migrated from a group with the specified identifier. This number
     * may be greater than 32 bits and some programming languages may have difficulty/silent defects in
     * interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float
     * type are safe for storing this identifier.
     */
    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public boolean hasMigrateFromChatId() {
        return migrateFromChatId != null;
    }

    /**
     * Optional. Specified message was pinned. Note that the Message object in this field will not contain
     * further reply_to_message fields even if it is itself a reply.
     */
    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public boolean hasPinnedMessage() {
        return pinnedMessage != null;
    }

    /**
     * Optional. Message is an invoice for a <a href="https://core.telegram.org/bots/api#payments">payment</a>,
     * information about the invoice. <a href="https://core.telegram.org/bots/api#payments">More about payments</a>.
     */
    public Invoice getInvoice() {
        return invoice;
    }

    public boolean hasInvoice() {
        return invoice != null;
    }

    /**
     * Optional. Message is a service message about a successful payment, information about the payment.
     * <a href="https://core.telegram.org/bots/api#payments">More about payments</a>.
     */
    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public boolean hasSuccessfulPayment() {
        return successfulPayment != null;
    }

    /**
     * Optional. The domain name of the website on which the user has logged in.
     * <a href="https://core.telegram.org/widgets/login">More about Telegram Login</a>.
     */
    public String getConnectedWebsite() {
        return connectedWebsite;
    }

    public boolean hasConnectedWebsite() {
        return connectedWebsite != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(messageId, message.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId);
    }
}
