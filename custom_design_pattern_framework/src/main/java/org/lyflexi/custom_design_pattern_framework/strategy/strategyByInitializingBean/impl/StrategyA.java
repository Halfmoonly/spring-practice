package org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.impl;

import org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.AbstractStrategy;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.enums.StrategyInitializeType;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:14
 */
@Component
public class StrategyA extends AbstractStrategy {
    @Override
    public void execute(String data) {
        System.out.println("Executing Strategy A with data: " + data);
    }
    @Override
    public void setName(String name) {
        super.setName(StrategyInitializeType.TYPE_A.getIdentifier());
    }
}