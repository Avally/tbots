package org.avally.tbots.entity.reply;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * Upon receiving a message with this object, Telegram clients will display a reply interface to the user (act as if
 * the user has selected the bot‘s message and tapped ’Reply'). This can be extremely useful if you want to create
 * user-friendly step-by-step interfaces without having to sacrifice
 * <a href="https://core.telegram.org/bots#privacy-mode">privacy mode</a>.
 * Example: A <a href="https://t.me/PollBot">poll bot</a> for groups runs in privacy mode (only receives commands,
 * replies to its messages and mentions). There could be two ways to create a new poll:
 * Explain the user how to common a command with parameters (e.g. /newpoll question answer1 answer2). May be appealing
 * for hardcore users but lacks modern day polish.
 * Guide the user through a step-by-step process. ‘Please common me your question’, ‘Cool, now let’s add the first answer
 * option‘, ’Great. Keep adding answer options, then common /done when you‘re ready’.
 * The last option is definitely more attractive. And if you use {@link ForceReply} in your bot‘s questions, it will receive
 * the user’s answers even if it only receives replies, commands and mentions - without any extra work for the user.
 *
 * @author Dmitry Polishchuk
 */
public class ForceReply extends TelegramObject implements ReplyMarkup {
    //    @formatter:off
    @JsonProperty("force_reply") private Boolean forceReply;
    @JsonProperty("selective") private Boolean selective;
    //    @formatter:on

    /**
     * Shows reply interface to the user, as if they manually selected the bot‘s message and tapped ’Reply'
     */
    public ForceReply setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    /**
     * Optional. Use this parameter if you want to force reply from specific users only. Targets: 1) users that
     * are @mentioned in the text of the {@link org.avally.tbots.entity.Message} object; 2) if the bot's message is a
     * reply (has reply_to_message_id), sender of the original message.
     */
    public ForceReply setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForceReply that = (ForceReply) o;
        return Objects.equals(forceReply, that.forceReply) &&
                Objects.equals(selective, that.selective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forceReply, selective);
    }
}
