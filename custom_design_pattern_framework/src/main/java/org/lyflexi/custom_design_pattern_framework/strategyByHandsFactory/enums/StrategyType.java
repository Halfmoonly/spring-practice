package org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.enums;

import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.AbstractStrategy;
import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.impl.StrategyB;
import org.lyflexi.custom_design_pattern_framework.strategyByHandsFactory.impl.StrategyA;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:27
 */
public enum StrategyType {
    TYPE_A(StrategyA.class, "Strategy A"),
    TYPE_B(StrategyB.class, "Strategy B");

    private Class<? extends AbstractStrategy> clazz;
    private String name;

    StrategyType(Class<? extends AbstractStrategy> clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public AbstractStrategy getInstance() {
        try {
            AbstractStrategy strategy = clazz.getDeclaredConstructor().newInstance();
            strategy.setName(name);
            return strategy;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }
}