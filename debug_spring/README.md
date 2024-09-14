# spring-practice
# debug_spring
debug_spring涵盖以下调试记录
- xml
- ioc
- aop
- aware
- Bean后置处理器
- 循环依赖
- BeanFactory后置处理器
- 监听器测试
- 事务测试

注意：对于纯Spring测试，建议走Junit单元测试，如
```java
public class IOCTest {

    @Test
    public void test01() {

    }
}
```