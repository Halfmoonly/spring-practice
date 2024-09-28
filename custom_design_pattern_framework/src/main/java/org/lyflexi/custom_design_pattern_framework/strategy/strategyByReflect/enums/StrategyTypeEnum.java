package org.lyflexi.custom_design_pattern_framework.strategy.strategyByReflect.enums;

import org.lyflexi.custom_design_pattern_framework.strategy.strategyByReflect.Strategy;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByReflect.impl.StrategyA;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByReflect.impl.StrategyB;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:16
 */
public enum StrategyTypeEnum {
    TYPE_A(StrategyA.class, "Strategy A"),
    TYPE_B(StrategyB.class, "Strategy B");

    private Class<? extends Strategy> clazz;
    private String name;

    StrategyTypeEnum(Class<? extends Strategy> clazz, String name) {
        this.clazz = clazz;
        this.name = name;
    }

    public Strategy getInstance() {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }
}