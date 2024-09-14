package org.lyflexi.custom_design_pattern_framework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.BizServiceImpl;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.ConditionEnums;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.ParamA;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.ParamB;
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
        bizService.applyPublish(ParamA.builder().condition(ConditionEnums.ACTION_ONE.getType()).build()
                , ParamB.builder().condition(ConditionEnums.ACTION_TWO.getType()).build());
        bizService.approvePublish(ParamA.builder().condition(ConditionEnums.ACTION_ONE.getType()).build()
                , ParamB.builder().condition(ConditionEnums.ACTION_TWO.getType()).build());
        return ;
    }

}
