package com.spring.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Collections/springConfig.xml");
		
		Employees employee = (Employees) context.getBean("Employee");
		System.out.println(employee);

	}

}
