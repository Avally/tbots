package org.avally.tbots.method.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.avally.tbots.entity.File;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.method.BotMethod;

import java.io.IOException;

//fixme: fix javadoc
/**
 * Use this method to get basic info about a file and prepare it for downloading. For the moment, bots can download
 * files of up to 20MB in size. On success, a {@link File} object is returned. The file can then be downloaded via the link
 * https://api.telegram.org/file/bot<token>/<file_path>, where <file_path> is taken from the response.
 * It is guaranteed that the link will be valid for at least 1 hour. When the link expires, a new one can be requested
 * by calling getFile again.
 * Note: This function may not preserve the original file name and MIME type. You should save the file's MIME type
 * and name (if available) when the File object is received.
 *
 * @author Dmitry Polishchuk
 */
public class GetFile extends BotMethod<File> {
    @JsonProperty("file_id")
    private String fileId;

    /**
     * File identifier to get info about.
     */
    public GetFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    @Override
    public String getPath() {
        return "getFile";
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
