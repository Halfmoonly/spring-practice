package org.lyflexi.debug_spring.beanlifecircle;


import org.lyflexi.debug_springframework.beanlifecircle.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanLifeCycleTest {
    //

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beanlifecircle/applicationContext.xml");

        UserBean user = (UserBean) applicationContext.getBean("userBean");
        ((AbstractApplicationContext) applicationContext).close();
    }
}

