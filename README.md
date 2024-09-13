# spring-practice
# debug_spring
debug_spring涵盖以下调试记录
- aop
- aware
- Bean后置处理器
- 循环依赖
- BeanFactory后置处理器
- 监听器测试
- 事务测试

# custom_design_pattern_framework
custom_design_pattern_framework涵盖以下调试记录：
调试方式如下
1. 请按需excludeFilters相应的包，避免启动冲突
```java
@SpringBootApplication
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategyByReflect.*"),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.lyflexi.custom_design_pattern_framework.strategyByInitializingBean.*"),
})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
```
2. 执行单元测试目录
org.lyflexi.custom_design_pattern_framework


## 策略模式
  - 设计方式1：基于枚举和反射实现，按需实例化对应的策略
  - 设计方式2：手写策略工厂，基于InitializingBean#afterPropertiesSet自动注册所有策略到自己的策略工厂
  - 设计方法3：基于BeanFactoryPostProcessor，利用Spring现成BeanFactory，配合Aop注解实现

## 