package org.avally.tbots;

import org.avally.tbots.bot.BotDefinitionManager;
import org.avally.tbots.config.BotConfiguration;
import org.avally.tbots.config.BotConfigurationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BotManager {
    private BotDefinitionManager definitionManager;
    private BotConfigurationManager configurationManager;
    private RestTemplate rest;

    @Autowired
    public BotManager(BotDefinitionManager definitionManager,
                      BotConfigurationManager configurationManager,
                      RestTemplate rest) {
        this.definitionManager = definitionManager;
        this.configurationManager = configurationManager;
        this.rest = rest;
    }

    //    todo add caching for bot answers, don't create the new instance every time
    public BotAction getBotAction(String alias) {
        BotConfiguration botConfiguration = configurationManager.getBotConfiguration(alias);
        return new SpringBotAction(botConfiguration, rest);
    }

}
