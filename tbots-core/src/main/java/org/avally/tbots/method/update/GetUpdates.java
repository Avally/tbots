package org.avally.tbots.method.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.Update;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;
import java.util.List;

/**
 * Use this method to receive incoming updates using long polling (wiki). An Array of Update objects is returned.
 * Notes:
 * 1. This method will not work if an outgoing webhook is set up.
 * 2. In order to avoid getting duplicate updates, recalculate offset after each server response.
 *
 * @author Dmitry Polishchuk
 */
public class GetUpdates extends BotMethod<List<Update>> {
    //    @formatter:off
    @JsonProperty("offset") private Integer offset;
    @JsonProperty("limit") private Integer limit;
    @JsonProperty("timeout") private Integer timeout;
    @JsonProperty("allowed_updates") private List<String> allowedUpdates;
    //    @formatter:on

    /**
     * Identifier of the first update to be returned. Must be greater by one than the highest among the identifiers of
     * previously received updates. By default, updates starting with the earliest unconfirmed update are returned. An
     * update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id. The
     * negative offset can be specified to retrieve updates starting from -offset update from the end of the updates
     * queue. All previous updates will forgotten.
     */
    public GetUpdates setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Limits the number of updates to be retrieved. Values between 1—100 are accepted. Defaults to 100.
     */
    public GetUpdates setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling.
     * Should be positive, short polling should be used for testing purposes only.
     */
    public GetUpdates setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * List the types of updates you want your bot to receive. For example, specify [“message”, “edited_channel_post”,
     * “callback_query”] to only receive updates of these types. See Update for a complete list of available update
     * types. Specify an empty list to receive all updates regardless of type (default). If not specified, the
     * previous setting will be used.
     * Please note that this parameter doesn't affect updates created before the call to the getUpdates, so unwanted
     * updates may be received for a short period of time.
     */
    public GetUpdates setAllowedUpdates(List<String> allowedUpdates) {
        this.allowedUpdates = allowedUpdates;
        return this;
    }

    @Override
    public String getPath() {
        return "getUpdates";
    }

    @Override
    public TelegramResponse<List<Update>> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<List<Update>>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }

    }
}
