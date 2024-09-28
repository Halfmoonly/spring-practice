package org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.handler.userhandler;


import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.AbstractHandler;
import org.lyflexi.custom_design_pattern_framework.responsibilityChain.genericFactory.model.LoginUser;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: ly
 * @Date: 2024/3/13 22:50
 */
@Component
@Order(3)
public class VerifyPermissionHanlder extends AbstractHandler<LoginUser,Boolean> {
    @Override
    public Boolean doHandler(LoginUser targetData) {
        if (!"admin".equals(targetData.getPermission())){
            System.out.println("LoginUser暂无权限");
            return false;
        }
        System.out.println("3.LoginUser权限校验通过");
        return super.handle(targetData);
    }
}

