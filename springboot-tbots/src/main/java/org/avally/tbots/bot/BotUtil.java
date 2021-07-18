package org.avally.tbots.bot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.avally.tbots.Consume;
import org.avally.tbots.entity.Update;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.avally.tbots.entity.Update.*;

/**
 * Utility class for bots
 */
final class BotUtil {
    private static final Log LOG = LogFactory.getLog(BotUtil.class);

    //    Noninstantiable
    private BotUtil() {
        throw new AssertionError();
    }

    static List<UpdateMethod> fetchUpdateMethods(Object botInstance) {
        Class<?> botInstanceClass = botInstance.getClass();
        Method[] declaredMethods = botInstanceClass.getDeclaredMethods();
        return Arrays.stream(declaredMethods)
                .filter(method -> method.isAnnotationPresent(Consume.class))
                .filter(BotUtil::checkMethodRequirements)
                .map(method -> new UpdateMethod(botInstance, method, getAllowedUpdates(method)))
                .collect(Collectors.toList());
    }

    //    todo check for arguments count before check parameters type
    private static boolean checkMethodRequirements(Method method) {
        int modifiers = method.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isStatic = Modifier.isStatic(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);
        int parameterCount = method.getParameterCount();
        Class<?> parameterType = method.getParameterTypes()[0];
//        todo check this
        boolean typeEquality = parameterType.equals(Update.class);
        return isPublic && !isStatic && !isAbstract && parameterCount == 1 && typeEquality;
    }

    private static Set<String> getAllowedUpdates(Method method) {
        Consume consume = method.getAnnotation(Consume.class);
        return new HashSet<>(Arrays.asList(consume.value()));
    }

    /**
     * Define a list of methods that consumes incoming update
     *
     * @param update  to consume
     * @param methods from all beans corresponding to bot that can consume incoming updates of any type
     * @return methods that consumes incoming update
     * @throws IllegalArgumentException, implies that logic is broken. todo remove later
     */
    static UpdateMethod resolveUpdate(Update update, List<UpdateMethod> methods) {
        String updateType = fetchUpdateType(update);
//        todo check this
        return methods.stream()
                .filter(method -> canConsume(method, updateType))
                .min(UpdateMethod::compareTo)
                /*Types of allowed updates collecting from bot definition are used subsequently to request
                updates from telegram servers, so this method must find some UpdateMethod to consume update*/
                .orElseThrow(() ->
                        new IllegalArgumentException("No methods to consume incoming update of type: " + updateType));
    }

    private static boolean canConsume(UpdateMethod method, String updateType) {
        Set<String> methodUpdates = method.getAllowedUpdates();
        return methodUpdates.contains(updateType);
    }

    static String fetchUpdateType(Update update) {
//        @formatter:off
        if (update.hasMessage())            return MESSAGE;
        if (update.hasEditedMessage())      return EDITED_MESSAGE;
        if (update.hasChannelPost())        return CHANNEL_POST;
        if (update.hasEditedChannelPost())  return EDITED_CHANNEL_POST;
        if (update.hasInlineQuery())        return INLINE_QUERY;
        if (update.hasChosenInlineResult()) return CHOSEN_INLINE_RESULT;
        if (update.hasCallbackQuery())      return CALLBACK_QUERY;
        if (update.hasShippingQuery())      return SHIPPING_QUERY;
        if (update.hasPreCheckoutQuery())   return PRE_CHECKOUT_QUERY;
//        @formatter:on
//        update should contain at least one type from allowed update. Never happens
        throw new IllegalStateException("bad update: " + update);
    }
}
