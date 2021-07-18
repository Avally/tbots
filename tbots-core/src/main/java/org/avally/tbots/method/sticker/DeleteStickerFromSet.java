package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Use this method to delete a sticker from a set created by the bot. Returns True on success.
 *
 * @author Dmitry Polishchuk
 */
public class DeleteStickerFromSet extends StatusBotMethod {
    @JsonProperty("sticker")
    private String sticker;

    /**
     * File identifier of the sticker.
     */
    public DeleteStickerFromSet setSticker(String sticker) {
        this.sticker = sticker;
        return this;
    }

    @Override
    public String getPath() {
        return "deleteStickerFromSet";
    }
}
