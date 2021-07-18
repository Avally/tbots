package org.avally.tbots;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.avally.tbots.bot.BotDefinitionManager;
import org.avally.tbots.config.BotConfiguration;
import org.avally.tbots.config.BotConfigurationManager;
import org.avally.tbots.entity.User;
import org.avally.tbots.method.common.GetMe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@Component
class AppRunner implements CommandLineRunner {
    private static final Log LOG = LogFactory.getLog(AppRunner.class);
    private BotConfigurationManager configurationManager;
    private RestTemplate rest;
    private BotDefinitionManager definitionManager;

    public AppRunner(BotDefinitionManager definitionManager, BotConfigurationManager configurationManager,
                     RestTemplate rest) {
        this.definitionManager = definitionManager;
        this.configurationManager = configurationManager;
        this.rest = rest;
    }

    @Override
    public void run(String... args) {
        Set<String> botsAliases = definitionManager.getBotsAliases();
        for (String alias : botsAliases) {
            ThreadFactory threadFactory = r -> new Thread(r, alias + ":U"); // naming for update handling threads
            ExecutorService executorService = Executors.newSingleThreadExecutor(threadFactory);
            executorService.execute(() -> {
                BotConfiguration botConfiguration = configurationManager.getBotConfiguration(alias);
                BotAnswer botAnswer = new SpringBotAction(botConfiguration, rest);

                User bot = botAnswer.answer(new GetMe()); // test bot

                if (bot != null && bot.isBot()) {
                    LOG.info(alias + " (https://t.me/" + bot.getUserName() + ") has been started.");
//                    create update service
                    LongPollingUpdateService service =
                            new LongPollingUpdateService(definitionManager.getBotDefinition(alias), botAnswer);
                    while (!executorService.isShutdown()) {
                        service.makeRequest();
                    }
                } else {
//                todo shutdown app
                    LOG.error("Unable to start bot. Check bot token.");
                }
            });
        }
    }
}
