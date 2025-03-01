package com.hm.debugaopv2.test;

import com.hm.debugaopv2.DebugAopV2Application;
import com.hm.debugaopv2.service.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: hmly
 * @Date: 2025/3/1 20:36
 * @Project: spring-practice
 * @Version: 1.0.0
 * @Description:
 */

public class TestPostProcessor {
    public static void main(String[] args) {
        System.out.println("容器启动成功！");

        // 创建应用上下文（需指定配置类：包扫描类）
        // SpringBoot场景下，主启动类就是配置类包扫描类
        //@Target(ElementType.TYPE)
        //@Retention(RetentionPolicy.RUNTIME)
        //@Documented
        //@Inherited
        //@SpringBootConfiguration
        //@EnableAutoConfiguration
        //@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        //		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
        //public @interface SpringBootApplication
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DebugAopV2Application.class);

        // 获取所有Bean定义名称
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        // 打印当前容器所有BeanDefinition
        System.out.println("--- Bean列表 ---");
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        System.out.println("---------------");

        // 获取Calculator实例并调用方法
        Calculator calculator = applicationContext.getBean(Calculator.class);
        System.out.println(calculator.getClass().getName());
        calculator.add(1, 2);

        // 关闭容器
        applicationContext.close();
    }
}