package org.avally.tbots.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object represents a Telegram response.
 *
 * @author Dmitry Polishchuk
 */
// todo: add exception handling?
public class TelegramResponse<T> extends TelegramObject {
    //    @formatter:off
    @JsonProperty("ok") private Boolean ok;
    @JsonProperty("error_code") private Integer errorCode;
    @JsonProperty("description") private String errorDescription;
    @JsonProperty("parameters") private ResponseParameters parameters;
    @JsonProperty("result") private T result;
    //    @formatter:on

    /**
     * Status flag for telegram server response
     */
    public Boolean isOk() {
        return ok;
    }

    /**
     * Error code
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Error code description
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    public ResponseParameters getParameters() {
        return parameters;
    }

    /**
     * Response body of successful request
     */
    public T getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelegramResponse<?> that = (TelegramResponse<?>) o;
        return Objects.equals(ok, that.ok) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(errorDescription, that.errorDescription) &&
                Objects.equals(parameters, that.parameters) &&
                Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ok, errorCode, errorDescription, parameters, result);
    }
}
