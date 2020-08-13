package com.kingland.bootcamp;

import com.kingland.bootcamp.utils.MessageUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class TestMessages {

    @Autowired
    private MessageUtils messageUtils;

    @Test
    public void test() {
        //messageUtils.messageSource().getMessage("");
    }
}
