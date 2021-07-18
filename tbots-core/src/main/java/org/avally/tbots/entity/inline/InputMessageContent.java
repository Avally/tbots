package org.avally.tbots.entity.inline;

import org.avally.tbots.TelegramObject;

/**
 * This object represents the content of a message to be sent as a result of an inline query.
 * Telegram clients currently support the following 4 types:
 * - {@link InputTextMessageContent}
 * - {@link InputLocationMessageContent}
 * - {@link InputVenueMessageContent}
 * - {@link InputContactMessageContent}
 *
 * @author Dmitry Polishchuk
 */
public abstract class InputMessageContent extends TelegramObject {
}
