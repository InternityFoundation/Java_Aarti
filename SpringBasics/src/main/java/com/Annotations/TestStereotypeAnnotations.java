package com.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotations {
	
	public static void main(String[] args) {

	ApplicationContext con = new ClassPathXmlApplicationContext("com/Annotations/springConfig.xml");
	Student student = (Student) con.getBean("student");
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println(student.getAddress().getClass().getName());
	
}
}