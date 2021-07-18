package org.avally.tbots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.avally.tbots.entity.Update.*;

/**
 * Annotation that identify method of class, annotated with {@link TelegramBot} as handler for incoming updates of
 * specified type.
 *
 * @author Dmitry Polishchuk
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Consume {
    /**
     * Type of the allowed updates.
     * Use {@link org.avally.tbots.entity.Update} constants or left blank to receive all updates.
     */
    String[] value() default {
            MESSAGE,
            EDITED_MESSAGE,
            CHANNEL_POST,
            EDITED_CHANNEL_POST,
            INLINE_QUERY,
            CHOSEN_INLINE_RESULT,
            CALLBACK_QUERY,
            SHIPPING_QUERY,
            PRE_CHECKOUT_QUERY
    };
}
