package org.avally.tbots.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple storage for bot configurations.
 *
 * @author Dmitry Polishchuk
 */
@Service
public class BotConfigurationManager {
    private static final Log LOG = LogFactory.getLog(BotConfigurationManager.class);
    private Map<String, BotConfiguration> botsConfiguration = new HashMap<>();

    public void addBotConfiguration(String botAlias, BotConfiguration configuration) {
        if (botAlias == null || configuration == null) {
            throw new IllegalArgumentException("Argument can't be null!");
        }
        LOG.info("Configuration for '" + botAlias + "' has been found.");
        botsConfiguration.put(botAlias, configuration);
    }

    public BotConfiguration getBotConfiguration(String alias) {
        BotConfiguration configuration = botsConfiguration.get(alias);
        if (configuration == null)
//            todo change to more suitable exception
            throw new IllegalStateException("There is no configuration for '" + alias + "' alias");
        return configuration;
    }
}
