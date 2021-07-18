package org.avally.tbots.method.common;

import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.User;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * A simple method for testing your bot's auth token. Requires no parameters.
 * Returns basic information about the bot in form of a {@link User} object.
 *
 * @author Dmitry Polishchuk
 */
public class GetMe extends BotMethod<User> {
    @Override
    public String getPath() {
        return "getMe";
    }

    @Override
    public TelegramResponse<User> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<User>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
