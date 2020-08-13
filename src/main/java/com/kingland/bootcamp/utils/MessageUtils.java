package com.kingland.bootcamp.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * @author KSC
 * @description get i18n resources file
 */
public class MessageUtils {
    @Bean
    public ResourceBundleMessageSource messageSource() {
        Locale.setDefault(Locale.ENGLISH);
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        //source.setBasenames("i18n/messages");// name of the resource bundle
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        return source;
    }

}
