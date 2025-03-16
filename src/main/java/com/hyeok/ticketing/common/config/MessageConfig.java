package com.hyeok.ticketing.common.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();

        source.setBasenames("messages.messages", "messages.errors");
        source.setDefaultEncoding("UTF-8");
        // source.setUseCodeAsDefaultMessage(true); > 이거 적용하면 예외 응답시 발생하는 예외 처리 핸들링 못함, 그냥 예외 터져도 code 그 자체 내려줘서.

        return source;
    }
}

