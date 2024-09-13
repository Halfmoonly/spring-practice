package org.lyflexi.custom_design_pattern_framework.strategyByAop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.annotation.AiPassiveMsg;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.biz.Param1;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.context.MsgHandlerContext;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.handler.AiPassiveMsgHandler;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.utils.JoinPointUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:44
 */
@Aspect
@Component
@Slf4j
public class AiPassiveMsgAspect {


    @Autowired
    MsgHandlerContext msgHandlerContext;

    @Pointcut("@annotation(org.lyflexi.custom_design_pattern_framework.strategyByAop.annotation.AiPassiveMsg)")
    public void cut() {
        log.info("被动消息切面切入");
    }

    @AfterReturning("cut()")
    public void addAiInformation(JoinPoint joinPoint) throws IOException {
        AiPassiveMsg annotation = JoinPointUtils.getAnnotationByClass(joinPoint,AiPassiveMsg.class);
        // 通过枚举值或者方法的调用
        String sceneType = annotation.sceneType();
        String[] users = annotation.users();
        String param = annotation.param();
        AiPassiveMsgHandler instance = msgHandlerContext.getInstance(sceneType);
        HashMap<String, Object> map = new HashMap<>();
        instance.handle(map);
    }
}