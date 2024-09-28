package org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericBuilder.config;


import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericBuilder.ChainBuilder;
import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.model.LoginUser;
import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.model.Robot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/28 19:54
 */
@Configuration
public class ChainBuilderConfig {
    @Bean
    public ChainBuilder<LoginUser, Boolean> loginUserChainBuilder() {
        return new ChainBuilder<LoginUser, Boolean>();
    }
    @Bean
    public ChainBuilder<Robot, Boolean> robotChainBuilder() {
        return new ChainBuilder<Robot, Boolean>();
    }

}
