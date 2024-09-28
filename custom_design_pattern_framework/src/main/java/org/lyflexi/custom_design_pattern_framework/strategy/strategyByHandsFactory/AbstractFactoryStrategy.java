package org.lyflexi.custom_design_pattern_framework.strategy.strategyByHandsFactory;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:26
 */
public abstract class AbstractFactoryStrategy implements Strategy {

    private String name;

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
