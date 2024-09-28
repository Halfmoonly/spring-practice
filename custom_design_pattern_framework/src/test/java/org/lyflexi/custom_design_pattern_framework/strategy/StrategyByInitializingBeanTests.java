package org.lyflexi.custom_design_pattern_framework.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.AbstractStrategy;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.StrategyFactory;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.enums.StrategyInitializeType;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 策略模式：基于InitializingBean 与手写策略工厂
 */
@SpringBootTest
@Slf4j
class StrategyByInitializingBeanTests {



    @Test
    void contextLoads() {
        StrategyInitializeType typeA = StrategyInitializeType.fromIdentifier("TYPE_A");
        StrategyInitializeType typeB = StrategyInitializeType.fromIdentifier("TYPE_B");

        AbstractStrategy strategyA = StrategyFactory.getStrategy(typeA);
        strategyA.execute("dataA");
        AbstractStrategy strategyB = StrategyFactory.getStrategy(typeB);
        strategyB.execute("dataB");
    }

}
