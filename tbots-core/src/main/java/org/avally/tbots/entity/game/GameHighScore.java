package org.avally.tbots.entity.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.User;

import java.util.Objects;

/**
 * This object represents one row of the high scores table for a game.
 *
 * @author Dmitry Polishchuk
 */
//todo check if setters required
public class GameHighScore extends TelegramObject {
    //    @formatter:off
    @JsonProperty("position") private Integer position;
    @JsonProperty("user") private User user;
    @JsonProperty("score") private Integer score;
    //    @formatter:on

    /**
     * Position in high score table for the game.
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * User.
     */
    public User getUser() {
        return user;
    }

    /**
     * Score.
     */
    public Integer getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameHighScore that = (GameHighScore) o;
        return Objects.equals(position, that.position) &&
                Objects.equals(user, that.user) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, user, score);
    }
}
