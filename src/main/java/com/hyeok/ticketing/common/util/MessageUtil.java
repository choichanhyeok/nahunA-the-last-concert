package com.hyeok.ticketing.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Slf4j
@Component
public class MessageUtil {

    private static MessageSource messageSource;

    public MessageUtil(MessageSource messageSource) {
        MessageUtil.messageSource = messageSource;
    }

    public static String getMessage(String code) {
        try {
            return messageSource.getMessage(code, null, Locale.getDefault());
        } catch (NoSuchMessageException e) {
            log.warn("메시지 코드 미정의: {}", code);
            return "정의되지 않은 메시지 코드: " + code;
        }
    }
}
