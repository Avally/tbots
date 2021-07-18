package org.avally.tbots.config;

/**
 * Simple class for storing bot configuration.
 */
public class BotConfiguration {
    private static final String BOT_URL_HEAD = "https://api.telegram.org/";
    private String botToken;
    private int answerThreadCount;

    //    considering for internal use
    String getBotToken() {
        return botToken;
    }

    public BotConfiguration setBotToken(String botToken) {
        this.botToken = botToken;
        return this;
    }

    //    considering for internal use
    public int getAnswerThreadCount() {
        return answerThreadCount;
    }

    public BotConfiguration setAnswerThreadCount(int answerThreadCount) {
        this.answerThreadCount = answerThreadCount;
        return this;
    }

    //    considering for internal use
    public String getBaseUrl() {
        return BOT_URL_HEAD + "bot" + botToken + "/";
    }

    public String getFileDownloadBaseUrl() {
        return BOT_URL_HEAD + "file/bot" + botToken + "/";
    }
}
