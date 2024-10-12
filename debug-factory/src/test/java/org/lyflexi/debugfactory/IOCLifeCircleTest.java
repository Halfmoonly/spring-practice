package org.lyflexi.debugfactory;


import org.junit.jupiter.api.Test;
import org.lyflexi.debugfactory.config.ExtConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCLifeCircleTest {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);


		applicationContext.close();
	}

}
