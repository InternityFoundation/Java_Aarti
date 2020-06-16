package com.spring.ReferenceObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ReferenceObject/springConfig.xml");
		A  temp = (A) context.getBean("aref");
		System.out.println("Value of x from A");
		System.out.println(temp.getX());
		System.out.println("Value of B obj  from A");
		System.out.println(temp.getObj().getY());
		
		System.out.println(temp);

	}

}
