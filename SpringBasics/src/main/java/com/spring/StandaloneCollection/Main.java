package com.spring.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/StandaloneCollection/springConfig.xml");
		
		Employees employee = (Employees) context.getBean("employee");
		System.out.println(employee);
		System.out.println(employee.getFriends().getClass().getName());
		System.out.println("------------------------");
		System.out.println(employee.getFeeStructure());
		System.out.println(employee.getFeeStructure().getClass().getName());
		System.out.println("------------------------");
		System.out.println(employee.getProperties());
		System.out.println(employee.getProperties().getClass().getName());
		
		

	}

}
