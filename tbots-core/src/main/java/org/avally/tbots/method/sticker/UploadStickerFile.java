package org.avally.tbots.method.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.File;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;
import java.io.InputStream;

//todo: not complete. Check "png_sticker" field

/**
 * Use this method to upload a .png file with a sticker for later use in createNewStickerSet and addStickerToSet
 * methods (can be used multiple times). Returns the uploaded {@link File} on success.
 *
 * @author Dmitry Polishchuk
 */
public class UploadStickerFile extends BotMethod<File> {
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("png_sticker")
    private InputStream pngSticker;

    /**
     * User identifier of sticker file owner.
     */
    public UploadStickerFile setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Png image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px,
     * and either width or height must be exactly 512px. More info on Sending Files ».
     */
    public UploadStickerFile setPngSticker(InputStream pngSticker) {
        this.pngSticker = pngSticker;
        return this;
    }

    @Override
    public String getPath() {
        return "uploadStickerFile";
    }

    @Override
    public TelegramResponse<File> deserializeResponse(String input) {
        try {
            return OBJECT_MAPPER.readValue(input,
                    new TypeReference<TelegramResponse<File>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException("Unable to deserialize response from '" + this.getPath() + "' method call");
        }
    }
}
