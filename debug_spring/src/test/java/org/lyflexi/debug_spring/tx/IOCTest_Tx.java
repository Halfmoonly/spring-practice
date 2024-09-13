package org.lyflexi.debug_spring.tx;

import org.junit.jupiter.api.Test;
import org.lyflexi.debug_springframework.tx.TxConfig;
import org.lyflexi.debug_springframework.tx.UserService;
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
