package org.avally.tbots;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.avally.tbots.bot.BotDefinitionManager;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * {@link BeanPostProcessor} that finds Spring beans annotated with {@link TelegramBot}.
 */
@Component
public class TelegramBotAnnotationBeanPostProcessor implements BeanPostProcessor {
    private static final Log LOG = LogFactory.getLog(TelegramBotAnnotationBeanPostProcessor.class);
    private BotDefinitionManager definitionManager = new BotDefinitionManager();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        if (beanClass.isAnnotationPresent(TelegramBot.class)) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Find TelegramBot annotated class: " + beanClass.getName());
            }
            definitionManager.addBotBean(bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Bean
    public BotDefinitionManager getDefinitionManager() {
        return definitionManager;
    }
}
