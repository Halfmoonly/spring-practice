package org.lyflexi.custom_design_pattern_framework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.BizServiceImpl;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.Param1;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.Param2;
import org.lyflexi.custom_design_pattern_framework.strategyByReflect.StrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 策略模式：基于BeanFactory与面向注解的Aop实现
 */
@SpringBootTest
@Slf4j
class StrategyByAop {
    @Autowired
    private BizServiceImpl bizService;


    @Test
    void contextLoads() {
        bizService.applyPublish(new Param1());
        bizService.approvePublish(new Param2());
        return ;
    }

}
