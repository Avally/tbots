package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.entity.sticker.StickerSet;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

/**
 * Use this method to get a sticker set. On success, a {@link StickerSet} object is returned.
 *
 * @author Dmitry Polishchuk
 */
public class GetStickerSet extends BotMethod<StickerSet> {
    @JsonProperty("name")
    private String name;

    /**
     * Name of the sticker set.
     */
    public GetStickerSet setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getPath() {
        return "getStickerSet";
    }

    @Override
    public TelegramResponse<StickerSet> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<StickerSet>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
