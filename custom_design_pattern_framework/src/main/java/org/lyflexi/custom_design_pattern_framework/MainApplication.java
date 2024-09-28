package org.lyflexi.custom_design_pattern_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:17
 */
@SpringBootApplication
@ComponentScan(excludeFilters = {
        //strategy
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategy.strategyByReflect.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategy.strategyByInitializingBean.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategy.strategyByAop.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategy.strategyByHandsFactory.*"),
        //responsibilityChain
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.*"),
})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
