package org.lyflexi.debugcirculardependency;



import org.lyflexi.debugcirculardependency.dependence_hasaop.Circle;
import org.lyflexi.debugcirculardependency.dependence_hasaop.Loop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DependenceHasaopTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:dependencecircle/dependence_hasaop.xml");
        Circle circle = (Circle)context.getBean("circle");
        Loop loop = (Loop) context.getBean("loop");
        System.out.println(circle.getClass().getTypeName());
        System.out.println(loop.getClass().getTypeName());
        circle.sayHello("circle");
        loop.sayHello("loop");
    }
}
