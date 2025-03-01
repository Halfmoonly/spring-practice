package com.hm.debugaopv2.component;

import com.hm.debugaopv2.service.Calculator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * @Author: hmly
 * @Date: 2025/3/1 20:29
 * @Project: spring-practice
 * @Version: 1.0.0
 * @Description:
 * eg. 不加@Component注解，打印如下，说明AOP代理没有生效
 * ---------------
 * com.hm.debugaopv2.service.impl.CalCulatorImpl
 * a + b = 3
 *
 * eg. 加@Component注解，打印如下，说明AOP代理生效了：MyAspectJAutoProxyCreator
 * ---------------
 * jdk.proxy2.$Proxy38
 * 开始计算...
 * a + b = 3
 * 结束计算...
 */
@Component
public class MyAspectJAutoProxyCreator implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 仅对Calculator类型bean创建代理
        if (bean instanceof Calculator) {
            return Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("开始计算...");
                            Object result = method.invoke(bean, args);
                            System.out.println("结束计算...");
                            return result;
                        }
                    });
        }
        // 非Calculator类型返回原始bean
        return bean;
    }
}