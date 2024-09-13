package org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:29
 */
@Component
public class StrategyContext {

    private AbstractStrategy strategy;

    public void setStrategy(String strategyType) {
        AbstractStrategy newStrategy = StrategyFactory.getStrategy(strategyType);
        if (newStrategy != null) {
            this.strategy = newStrategy;
        }
    }

    public void executeStrategy(String data) {
        if (strategy != null) {
            strategy.execute(data);
        }
    }

    public String getStrategyName() {
        return strategy != null ? strategy.getName() : null;
    }
}