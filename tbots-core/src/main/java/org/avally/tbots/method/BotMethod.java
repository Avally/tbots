package org.avally.tbots.method;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.avally.tbots.TelegramObject;
import org.avally.tbots.entity.TelegramResponse;

import java.io.File;
import java.io.InputStream;

/**
 * Common interface for all bot methods
 *
 * @author Dmitry Polishchuk
 */
public abstract class BotMethod<T> extends TelegramObject {
    /**
     * Retrieve the url path for bot action
     *
     * @return method path
     */
    @JsonIgnore
    public abstract String getPath();

    /**
     * Default response unmarshaller
     *
     * @param input JSON entity representation
     * @return deserialized object
     */
    public TelegramResponse<T> deserializeResponse(String input) {
        throw new UnsupportedOperationException("implementation not found");
    }

//    todo hide following methods from client

    /**
     * @return true if method has new data to send
     */
    protected boolean hasNewData() {
        return false;
    }

    /**
     * Use for retrieving the new data from method
     *
     * @return new data {@link File}
     */
    protected File getNewFile() {
        throw new UnsupportedOperationException("not implemented");
    }

    /**
     * Use for retrieving the new data from method
     *
     * @return new data {@link InputStream}
     */
    protected InputStream getNewStream() {
        throw new UnsupportedOperationException("not implemented");
    }
}
