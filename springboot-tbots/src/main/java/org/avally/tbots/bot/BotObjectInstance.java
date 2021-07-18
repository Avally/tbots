package org.avally.tbots.bot;

import org.avally.tbots.entity.Update;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An abstraction over bean instance of bot. Contains bean instance and corresponding methods for consuming updates.
 *
 * @author Dmitry Polishchuk.
 */
class BotObjectInstance {
    private List<UpdateMethod> updateMethods;

    BotObjectInstance(List<UpdateMethod> updateMethods) {
        this.updateMethods = updateMethods;
    }

    UpdateMethod resolveMethod(Update update) {
        return BotUtil.resolveUpdate(update, updateMethods);
    }

    /**
     * Fetch all allowed updates from single bot class.
     *
     * @return set of allowed updates for this bot class.
     */
    Set<String> getAllowedUpdates() {
        return updateMethods.stream()
                .flatMap(updateMethod -> updateMethod.getAllowedUpdates().stream())
                .collect(Collectors.toSet());
    }
}
