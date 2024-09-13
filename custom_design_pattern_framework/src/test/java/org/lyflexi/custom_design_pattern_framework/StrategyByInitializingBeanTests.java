package org.lyflexi.custom_design_pattern_framework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 策略模式：基于InitializingBean 与手写策略工厂
 */
@SpringBootTest
@Slf4j
class StrategyByInitializingBeanTests {
    @Autowired
    private StrategyContext context;


    @Test
    void contextLoads() {
        context.setStrategy("TYPE_A");
        context.executeStrategy("data");
        log.info("Strategy: {}  executed",context.getStrategyName());
        return ;
    }

}
