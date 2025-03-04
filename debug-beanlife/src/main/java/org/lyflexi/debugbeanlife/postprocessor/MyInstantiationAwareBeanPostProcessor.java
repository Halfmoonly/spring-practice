package org.lyflexi.debugbeanlife.postprocessor;

import org.lyflexi.debugbeanlife.bean.UserBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("userBean".equals(beanName)) {
            System.out.println("1. 调用 InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation() 方法");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("userBean".equals(beanName)) {
            UserBean userBean = (UserBean) bean;
            System.out.println("3. 调用 InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation() 方法"+userBean);
        }
        return true;
    }

    /*
    注意：运行程序并没有打印xml中的setter注入是因为：此处重写了InstantiationAwareBeanPostProcessor的postProcessProperties方法
    * 这会导致setter注入失效。即interface实现与xml反射共存时候，以interface实现为主
    * */
/*    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("userBean".equals(beanName)) {
            System.out.println("4. 调用 InstantiationAwareBeanPostProcessor.postProcessProperties() 方法");
        }
        return null;
    }*/
}

