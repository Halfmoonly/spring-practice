package org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.impl;

import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.AbstractStrategy;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:14
 */
public class StrategyB extends AbstractStrategy {
    @Override
    public void execute(String data) {
        System.out.println("Executing Strategy B with data: " + data);
    }
}