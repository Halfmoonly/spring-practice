package org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean.impl;

import org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean.AbstractStrategy;
import org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean.Strategy;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:14
 */
public class StrategyA extends AbstractStrategy {
    @Override
    public void execute(String data) {
        System.out.println("Executing Strategy A with data: " + data);
    }
}