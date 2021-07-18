package org.avally.tbots.entity.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a sticker set.
 *
 * @author Dmitry Polishchuk
 */
//todo check accessors requirements / getters required
public class StickerSet extends TelegramObject {
    //    @formatter:off
    @JsonProperty("name") private String name;
    @JsonProperty("title") private String title;
    @JsonProperty("contains_masks") private Boolean containsMasks;
    @JsonProperty("stickers") private List<Sticker> stickers;
    //    @formatter:on

    /**
     * Sticker set name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sticker set title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * True, if the sticker set contains masks.
     */
    public Boolean getContainsMasks() {
        return containsMasks;
    }

    /**
     * List of all set stickers.
     */
    public List<Sticker> getStickers() {
        return stickers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StickerSet that = (StickerSet) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(title, that.title) &&
                Objects.equals(containsMasks, that.containsMasks) &&
                Objects.equals(stickers, that.stickers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, title, containsMasks, stickers);
    }
}
