package org.lyflexi.custom_design_pattern_framework.strategyByAop.handler.annotationHander;

import lombok.extern.slf4j.Slf4j;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.annotation.PassiveMsgHandlerType;
import org.lyflexi.custom_design_pattern_framework.strategyByAop.handler.AiPassiveMsgHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:49
 */
@Slf4j
@PassiveMsgHandlerType("audit.serviceVersion.publish")
public class PublishServiceVersionMsgHandler extends AiPassiveMsgHandler {

    @Override
    public Map<String, Object> handle(Map<String, Object> params) {
        try {
            log.info("PublishServiceVersionMsgHandler begin");
        }
        catch (RuntimeException e) {
        }

        return new HashMap<>();
    }
}