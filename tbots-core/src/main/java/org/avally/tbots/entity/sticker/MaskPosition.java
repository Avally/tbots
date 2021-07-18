package org.avally.tbots.entity.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.avally.tbots.TelegramObject;

import java.util.Objects;

/**
 * This object describes the position on faces where a mask should be placed by default.
 *
 * @author Dmitry Polishchuk
 */
public class MaskPosition extends TelegramObject {
    //    @formatter:off
    @JsonProperty("point") private String point;
    @JsonProperty("x_shift") private Float xShift;
    @JsonProperty("y_shift") private Float yShift;
    @JsonProperty("scale") private Float scale;
    //    @formatter:on

    /**
     * The part of the face relative to which the mask should be placed.
     * One of “forehead”, “eyes”, “mouth”, or “chin”.
     */
    public MaskPosition setPoint(String point) {
        this.point = point;
        return this;
    }

    /**
     * Shift by X-axis measured in widths of the mask scaled to the face size, from left to right.
     * For example, choosing -1.0 will place mask just to the left of the default mask position.
     */
    public MaskPosition setxShift(Float xShift) {
        this.xShift = xShift;
        return this;
    }

    /**
     * Shift by Y-axis measured in heights of the mask scaled to the face size, from top to bottom.
     * For example, 1.0 will place the mask just below the default mask position.
     */
    public MaskPosition setyShift(Float yShift) {
        this.yShift = yShift;
        return this;
    }

    /**
     * Mask scaling coefficient. For example, 2.0 means double size.
     */
    public MaskPosition setScale(Float scale) {
        this.scale = scale;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaskPosition that = (MaskPosition) o;
        return Objects.equals(point, that.point) &&
                Objects.equals(xShift, that.xShift) &&
                Objects.equals(yShift, that.yShift) &&
                Objects.equals(scale, that.scale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, xShift, yShift, scale);
    }
}
