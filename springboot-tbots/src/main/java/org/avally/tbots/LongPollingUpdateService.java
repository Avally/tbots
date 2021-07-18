package org.avally.tbots;

import org.avally.tbots.bot.BotDefinition;
import org.avally.tbots.entity.Update;
import org.avally.tbots.method.update.GetUpdates;

import java.util.List;

/**
 * @author Dmitry Polishchuk
 */
class LongPollingUpdateService {
    private GetUpdates getUpdates;
    private BotAnswer botAnswer;
    private BotDefinition botDefinition;

    LongPollingUpdateService(BotDefinition botDefinition, BotAnswer botAnswer) {
        this.botDefinition = botDefinition;
        this.botAnswer = botAnswer;
        this.getUpdates = new GetUpdates()
                .setTimeout(10_000);
    }

    /**
     * method for making request to telegram servers using long pooling
     */
    void makeRequest() {
        List<Update> updates = botAnswer.answer(getUpdates);
        calculateOffset(updates);
        updates.forEach(update -> botDefinition.resolveMethod(update).invoke(update));
    }

    /**
     * Calculate offset for next request to Telegram servers.
     *
     * @param updates list from previous request.
     */
    private void calculateOffset(List<Update> updates) {
        updates.stream()
                .map(Update::getUpdateId)
                .max(Integer::compare)
                .ifPresent(integer -> getUpdates.setOffset(integer + 1));
    }
}