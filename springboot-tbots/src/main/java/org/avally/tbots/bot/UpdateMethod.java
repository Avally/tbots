package org.avally.tbots.bot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.avally.tbots.entity.Update;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * An abstraction over client bot method that consumes {@link Update}.
 */
public class UpdateMethod implements Comparable<UpdateMethod> {
    private static final Log LOG = LogFactory.getLog(UpdateMethod.class);
    private Object botInstance;
    private Method method;
    private Set<String> allowedUpdates;

    UpdateMethod(Object botInstance, Method method, Set<String> allowedUpdates) {
        this.botInstance = botInstance;
        this.method = method;
        this.allowedUpdates = allowedUpdates;
    }

    Set<String> getAllowedUpdates() {
        return allowedUpdates;
    }

    //    todo check this
    @Override
    public int compareTo(UpdateMethod that) {
        int thisSize = this.allowedUpdates.size();
        int thatSize = that.allowedUpdates.size();
        return (thisSize - thatSize);
    }

    public void invoke(Update update) {
        try {
            method.invoke(botInstance, update);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LOG.error("invoke method " + method.getName() + " fail for update: " + update);
            e.printStackTrace();
        }
    }
}
