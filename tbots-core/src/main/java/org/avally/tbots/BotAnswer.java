package org.avally.tbots;

import org.avally.tbots.method.BotMethod;

import java.util.concurrent.Future;

/**
 * Main interface to send answers from bot.
 */
public interface BotAnswer {
    /**
     * @param method {@link BotMethod} to sent
     * @param <T>    type of telegram server response to sent answer
     */
    <T, Method extends BotMethod<T>> T answer(Method method);

    /**
     * Send answer asynchronously
     *
     * @return {@link Future} with answer from telegram server
     */
    <T, Method extends BotMethod<T>> Future<T> answerAsync(Method method);
}
