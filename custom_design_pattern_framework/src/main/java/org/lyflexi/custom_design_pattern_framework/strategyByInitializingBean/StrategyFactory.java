package org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:28
 */
public class StrategyFactory {

    private static Map<String, AbstractStrategy> strategies = new ConcurrentHashMap<>();

    public static synchronized void registerStrategy(AbstractStrategy strategy) {
        strategies.put(strategy.getName(), strategy);
    }

    public static AbstractStrategy getStrategy(String name) {
        return strategies.get(name);
    }
}