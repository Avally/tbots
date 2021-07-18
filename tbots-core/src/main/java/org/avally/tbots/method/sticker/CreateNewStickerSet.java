package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.entity.sticker.MaskPosition;
import org.avally.tbots.method.StatusBotMethod;

/**
 * Use this method to create new sticker set owned by a user. The bot will be able to edit the created sticker set.
 * Returns True on success.
 *
 * @author Dmitry Polishchuk
 */
public class CreateNewStickerSet extends StatusBotMethod {
    //    @formatter:off
    @JsonProperty("user_id") private Integer userId;
    @JsonProperty("name") private String name;
    @JsonProperty("title") private String title;
//    todo: not complete
    @JsonProperty("png_sticker") private String pngSticker;
    @JsonProperty("emojis") private String emojis;
    @JsonProperty("contains_masks") private Boolean containsMasks;
    @JsonProperty("mask_position") private MaskPosition maskPosition;
    //    @formatter:on

    /**
     * User identifier of created sticker set owner.
     */
    public CreateNewStickerSet setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

//  fixme: javadoc

    /**
     * Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only english
     * letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end
     * in “_by_<bot username>”. <bot_username> is case insensitive. 1-64 characters.
     */
    public CreateNewStickerSet setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sticker set title, 1-64 characters.
     */
    public CreateNewStickerSet setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px,
     * and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already
     * exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet,
     * or upload a new one using multipart/form-data.
     */
    public CreateNewStickerSet setPngSticker(String pngSticker) {
        this.pngSticker = pngSticker;
        return this;
    }

    /**
     * One or more emoji corresponding to the sticker.
     */
    public CreateNewStickerSet setEmojis(String emojis) {
        this.emojis = emojis;
        return this;
    }

    /**
     * Optional. Pass True, if a set of mask stickers should be created.
     */
    public CreateNewStickerSet setContainsMasks(Boolean containsMasks) {
        this.containsMasks = containsMasks;
        return this;
    }

    /**
     * Optional. A JSON-serialized object for position where the mask should be placed on faces.
     */
    public CreateNewStickerSet setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
        return this;
    }

    @Override
    public String getPath() {
        return "createNewStickerSet";
    }
}
