package org.avally.tbots.bot;

import org.avally.tbots.TelegramBot;
import org.avally.tbots.entity.Update;

import java.util.*;

/**
 * Class for storing information for single bot. Contains all bean instances corresponding to bot alias
 */
public class BotDefinition {
    private String alias;
    private List<BotObjectInstance> botObjectInstances;
    private Set<String> allowedUpdates;
    private Map<String, UpdateMethod> resolvedMethods;

    /**
     * @param alias for bot as specified in {@link TelegramBot} annotation
     */
    BotDefinition(String alias) {
        this.alias = alias;
        this.botObjectInstances = new ArrayList<>();
        this.allowedUpdates = new HashSet<>();
    }

    public void consumeUpdate(Update update) {
        String updateType = BotUtil.fetchUpdateType(update);
        resolvedMethods.get(updateType).invoke(update);
    }

    /**
     * Get bot alias to which this definition assigned
     *
     * @return bot alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Add an instance of bot to specific {@link BotDefinition}
     *
     * @param instance of bot
     */
    void addBotObjectInstance(BotObjectInstance instance) {
        allowedUpdates.addAll(instance.getAllowedUpdates());
        botObjectInstances.add(instance);
    }

    /**
     * Get all allowed updates for single bot definition.
     *
     * @return set of allowed updates for specific bot.
     */
    Set<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    /**
     * Find method for bot to receive incoming update
     *
     * @param update received from telegram servers
     * @return user method to call
     */
    //    todo add properly resolving for BotObjectInstance method candidate
    public UpdateMethod resolveMethod(Update update) {
        return botObjectInstances.stream()
                .map(botObjectInstance -> botObjectInstance.resolveMethod(update))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Can't find method to consume incoming update"));
    }
}
