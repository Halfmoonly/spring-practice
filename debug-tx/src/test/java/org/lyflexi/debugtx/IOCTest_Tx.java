package org.lyflexi.debugtx;

import org.junit.jupiter.api.Test;
import org.lyflexi.debugtx.config.TxConfig;
import org.lyflexi.debugtx.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Tx {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();
        applicationContext.close();
    }
}
