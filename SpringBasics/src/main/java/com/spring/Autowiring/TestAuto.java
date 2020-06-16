package com.spring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Autowiring/springConfig.xml");
		Employeee employee= (Employeee) context.getBean("employee");
		//When you don't want to typecast
		//Employeee employeee= context.getBean("employee",Employeee.class);
		System.out.println(employee);
	
	}
}
