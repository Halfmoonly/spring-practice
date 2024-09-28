package org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.handler.robothandler;


import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.AbstractHandler;
import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.model.Robot;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: ly
 * @Date: 2024/3/13 22:33
 */
@Component
@Order(3)
public class RobotHandler3 extends AbstractHandler<Robot,Boolean> {
    @Override
    public Boolean doHandler(Robot targetData) {
        if(!"admin".equals(targetData.getRoleName())){
            System.out.println("Robot角色信息有误");
            return false;
        }
        System.out.println("3.Robot角色信息校验通过");

        return super.handle(targetData);
    }
}

