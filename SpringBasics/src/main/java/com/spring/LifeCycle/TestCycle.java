package com.spring.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/LifeCycle/springConfig.xml");
		Samosa samosa = (Samosa) context.getBean("samosa");
		System.out.println(samosa);
		System.out.println("-----------Using interface---------------");
		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		System.out.println(pepsi);
		
		System.out.println("-----------Using Annotations---------------");
		Example example = (Example ) context.getBean("example");
		System.out.println(example);
		context.registerShutdownHook();
	}

}
