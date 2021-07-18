package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.sticker.MaskPosition;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Use this method to add a new sticker to a set created by the bot. Returns True on success.
 *
 * @author Dmitry Polishchuk
 */
public class AddStickerToSet extends StatusBotMethod {
    //    @formatter:off
    @JsonProperty("user_id") private Integer userId;
    @JsonProperty("name") private String name;
//    todo: not complete
    @JsonProperty("png_sticker") private String pngSticker;
    @JsonProperty("emojis") private String emojis;
    @JsonProperty("mask_position") private MaskPosition maskPosition;
//    @formatter:on

    /**
     * User identifier of sticker set owner.
     */
    public AddStickerToSet setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Sticker set name.
     */
    public AddStickerToSet setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px,
     * and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already
     * exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet,
     * or upload a new one using multipart/form-data.
     */
    public AddStickerToSet setPngSticker(String pngSticker) {
        this.pngSticker = pngSticker;
        return this;
    }

    /**
     * One or more emoji corresponding to the sticker.
     */
    public AddStickerToSet setEmojis(String emojis) {
        this.emojis = emojis;
        return this;
    }

    /**
     * Optional. A JSON-serialized object for position where the mask should be placed on faces.
     */
    public AddStickerToSet setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    @Override
    public String getPath() {
        return "addStickerToSet";
    }
}
