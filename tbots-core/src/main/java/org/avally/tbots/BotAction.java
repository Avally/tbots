package org.avally.tbots;

import org.avally.tbots.entity.File;
import org.avally.tbots.entity.Update;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Interface to start/stop receiving updates from telegram servers
 */
public interface BotAction extends BotAnswer {
    /**
     * Start receiving updates from Telegram servers.
     *
     * @return true if bot has been started successfully, false otherwise
     */
    default boolean start() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Stop receiving updates from Telegram servers.
     *
     * @return list of unanswered updates
     */
    default List<Update> stop() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //    todo: add meaningful description
    InputStream downloadFile(String filePath) throws IOException;

    InputStream downloadFile(File file) throws IOException;
}
