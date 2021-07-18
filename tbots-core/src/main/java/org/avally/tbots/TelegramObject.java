package org.avally.tbots;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

/**
 * Parent for all <a href="https://core.telegram.org/bots/api#available-types">available types</a>.
 *
 * @author Dmitry Polishchuk
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(isGetterVisibility = NONE, setterVisibility = NONE)
public abstract class TelegramObject {
    //    todo: check for thread-safe method call
    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public final String toJson() {
        try {
            return OBJECT_MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
//           fixme: for development purpose, remove later
            throw new RuntimeException("Object mapping for '" + this.getClass().getCanonicalName() +
                    "' is not properly configured.", e);
        }
    }

    //    print object as json for the sake of brevity and readability
    @Override
    public String toString() {
        return toJson();
    }
}
