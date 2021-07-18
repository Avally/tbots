package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Use this method to move a sticker in a set created by the bot to a specific position. Returns True on success.
 *
 * @author Dmitry Polishchuk
 */
public class SetStickerPositionInSet extends StatusBotMethod {
    @JsonProperty("sticker")
    private String sticker;
    @JsonProperty("position")
    private Integer position;

    /**
     * File identifier of the sticker.
     */
    public SetStickerPositionInSet setSticker(String sticker) {
        this.sticker = sticker;
        return this;
    }

    /**
     * New sticker position in the set, zero-based.
     */
    public SetStickerPositionInSet setPosition(Integer position) {
        this.position = position;
        return this;
    }

    @Override
    public String getPath() {
        return "setStickerPositionInSet";
    }
}
