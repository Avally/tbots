package org.avally.tbots.entity.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.Animation;
import org.avally.tbots.entity.MessageEntity;
import org.avally.tbots.entity.PhotoSize;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a game. Use BotFather to create and edit games,
 * their short names will act as unique identifiers.
 *
 * @author Dmitry Polishchuk
 */
public class Game extends TelegramObject {
    //    @formatter:off
    @JsonProperty("title") private String title;
    @JsonProperty("description") private String description;
    @JsonProperty("photo") private List<PhotoSize> photo;
    @JsonProperty("text") private String text;
    @JsonProperty("text_entities") private List<MessageEntity> textEntities;
    @JsonProperty("animation") private Animation animation;
    //    @formatter:on

    /**
     * Title of the game.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Description of the game.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Photo that will be displayed in the game message in chats.
     */
    public List<PhotoSize> getPhoto() {
        return photo;
    }

    /**
     * Optional. Brief description of the game or high scores included in the game message.
     * Can be automatically edited to include current high scores for the game when the bot calls setGameScore,
     * or manually edited using editMessageText. 0-4096 characters.
     */
    public String getText() {
        return text;
    }

    /**
     * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
     */
    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    /**
     * Optional. Animation that will be displayed in the game message in chats. Upload via BotFather.
     */
    public Animation getAnimation() {
        return animation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(title, game.title) &&
                Objects.equals(description, game.description) &&
                Objects.equals(photo, game.photo) &&
                Objects.equals(text, game.text) &&
                Objects.equals(textEntities, game.textEntities) &&
                Objects.equals(animation, game.animation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, photo, text, textEntities, animation);
    }
}
