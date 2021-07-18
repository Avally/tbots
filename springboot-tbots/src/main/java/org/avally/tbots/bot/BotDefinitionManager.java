package org.avally.tbots.bot;

import org.avally.tbots.TelegramBot;

import java.util.*;

/**
 * Repository for storing all {@link BotDefinition}.
 *
 * @author Dmitry Polishchuk
 */
public class BotDefinitionManager {
    private Map<String, BotDefinition> botDefinitions = new HashMap<>();

    /**
     * Add bean that contains {@link TelegramBot} annotation to repository.
     * All bot meta will be extracted from bean when you call this method.
     * All bean validation will be performed.
     *
     * @param botInstance object instance of class that marked with {@link TelegramBot} annotation
     */
    public void addBotBean(Object botInstance) {
        Class<?> beanClass = botInstance.getClass();
        TelegramBot annotation = beanClass.getAnnotation(TelegramBot.class);
        String botAlias = annotation.value();
        if (botDefinitions.containsKey(botAlias)) {
            BotDefinition botDefinition = botDefinitions.get(botAlias);
            List<UpdateMethod> updateMethods = BotUtil.fetchUpdateMethods(botInstance);

            botDefinition.addBotObjectInstance(new BotObjectInstance(updateMethods));
        } else {
            botDefinitions.put(botAlias, new BotDefinition(botAlias));
            addBotBean(botInstance);
        }
    }

    /**
     * Fetch bot definition.
     *
     * @param alias for bot as specified in {@link TelegramBot}
     * @return {@link BotDefinition} for bot or {@code null} if definition doesn't exist
     */
    public BotDefinition getBotDefinition(String alias) {
        return botDefinitions.get(alias);
    }

    /**
     * Get aliases for all bots.
     *
     * @return bot aliases
     */
    public Set<String> getBotsAliases() {
        return botDefinitions.keySet();
    }

    /**
     * Get all allowed updates for specific bot.
     *
     * @param alias for bot
     * @return allowed updates
     * @throws NoSuchElementException if there is no {@link BotDefinition} for alias
     */
    public Set<String> getAllowedUpdates(String alias) {
        BotDefinition botDefinition = botDefinitions.get(alias);
        if (botDefinition == null) {
            throw new NoSuchElementException("There is no bot definition for alias: " + alias);
        }
        return botDefinition.getAllowedUpdates();
    }
}
