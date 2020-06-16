package com.spring.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ConstructorInjection/springConfig.xml");
		Person person = (Person) context.getBean("Person");
		System.out.println(person);
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}

}
