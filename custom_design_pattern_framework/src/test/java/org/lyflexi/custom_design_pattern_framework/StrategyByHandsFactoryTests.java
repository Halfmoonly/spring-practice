package org.lyflexi.custom_design_pattern_framework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.AbstractFactoryStrategy;
import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.StrategyFactory;
import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.enums.StrategyFactoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 策略模式：基于Spring3新特性，通过构造函数@Autowired批量注入Bean
 */
@SpringBootTest
@Slf4j
class StrategyByHandsFactoryTests {

    @Autowired
    StrategyFactory strategyFactory;

    @Test
    void contextLoads() {
        StrategyFactoryType typeA = StrategyFactoryType.fromIdentifier("TYPE_A");
        StrategyFactoryType typeB = StrategyFactoryType.fromIdentifier("TYPE_B");

        AbstractFactoryStrategy strategyA = strategyFactory.getStrategy(typeA);
        strategyA.execute("dataA");
        AbstractFactoryStrategy strategyB = strategyFactory.getStrategy(typeB);
        strategyB.execute("dataB");
    }

}
