package org.lyflexi.custom_design_pattern_framework.strategy.strategyByAop.handler.annotationHander;

import lombok.extern.slf4j.Slf4j;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByAop.annotation.PassiveMsgHandlerType;
import org.lyflexi.custom_design_pattern_framework.strategy.strategyByAop.handler.AiPassiveMsgHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: lyflexi
 * @project: spring-practice
 * @Date: 2024/9/13 22:52
 */
@Slf4j
@PassiveMsgHandlerType("audit.serviceVersion.publish.audit")
public class ApprovePublishServiceVersionMsgHandler extends AiPassiveMsgHandler {

    @Override
    public Map<String, Object> handle(Map<String, Object> params) {
        try {
            log.info("ApprovePublishServiceVersionMsgHandler begin");
        }
        catch (RuntimeException e) {
        }
        return new HashMap<>();
    }
}