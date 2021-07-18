package org.avally.tbots;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.avally.tbots.config.BotConfiguration;
import org.avally.tbots.entity.File;
import org.avally.tbots.entity.TelegramResponse;
import org.avally.tbots.method.BotMethod;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SpringBotAction implements BotAction {
    private static final Log LOG = LogFactory.getLog(SpringBotAction.class);
    private BotConfiguration configuration;
    private RestTemplate rest;
    private ExecutorService executor;


    SpringBotAction(BotConfiguration configuration, RestTemplate rest) {
        this.configuration = configuration;
        this.rest = rest;
        int poolSize = configuration.getAnswerThreadCount();
        LOG.info("Starting new fixed thread pool with capacity: " + poolSize);
        this.executor = Executors.newFixedThreadPool(poolSize);
    }

    @Override
    public <T, Method extends BotMethod<T>> T answer(Method method) {
        String url = configuration.getBaseUrl() + method.getPath();
        TelegramResponse<T> telegramResponse = method.deserializeResponse(sendAnswer(method, url));
        if (telegramResponse.isOk()) {
            return telegramResponse.getResult();
        } else {
            LOG.error("[" + telegramResponse.getErrorCode() + "] " + telegramResponse.getErrorDescription());
//            fixme: return the response with error message for bad request data
            return null;
        }

    }

    @Override
    public <T, Method extends BotMethod<T>> Future<T> answerAsync(Method method) {
        return executor.submit(() -> answer(method));
    }

    @Override
    public InputStream downloadFile(String filePath) throws IOException {
        String fileUrl = configuration.getFileDownloadBaseUrl() + filePath;
        return new URL(fileUrl).openStream();
    }

    @Override
    public InputStream downloadFile(File file) throws IOException {
        return downloadFile(file.getFilePath());
    }

    private <T, Method extends BotMethod<T>> String sendAnswer(Method method, String url) {
        rest.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//        Set headers
        HttpHeaders headers = new HttpHeaders();
        /*
          By default RestTemplate has ISO-8859-1 StringHttpMessageConverter which is used to
          convert a JAVA object to request payload
         */
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//        todo: check this
        headers.setAcceptCharset(Collections.singletonList(Charset.forName("UTF-8")));
        HttpEntity<String> httpEntity = new HttpEntity<>(method.toJson(), headers);
//        Send request and parse result
        ResponseEntity<String> response = rest.exchange(url, HttpMethod.POST, httpEntity, String.class);
        return response.getBody();
    }
}
