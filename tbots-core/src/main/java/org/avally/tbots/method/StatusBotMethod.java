package org.avally.tbots.method;

import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.TelegramResponse;

import java.io.IOException;

public abstract class StatusBotMethod extends BotMethod<Boolean> {

    @Override
    public TelegramResponse<Boolean> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<Boolean>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
