package org.avally.tbots.entity;

/**
 * Use as annotation parameter of to specify allowed updates
 */
public enum UpdateType {
    MESSAGE("message"),
    EDITED_MESSAGE("edited_message"),
    CHANNEL_POST("channel_post"),
    EDITED_CHANNEL_POST("edited_channel_post"),
    INLINE_QUERY("inline_query"),
    CHOSEN_INLINE_RESULT("chosen_inline_result"),
    CALLBACK_QUERY("callback_query"),
    SHIPPING_QUERY("shipping_query"),
    PRE_CHECKOUT_QUERY("pre_checkout_query");

    private String type;

    UpdateType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
