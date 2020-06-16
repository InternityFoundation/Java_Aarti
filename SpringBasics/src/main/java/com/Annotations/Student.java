package com.Annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Component("student1") to change default value of student obj made by component
public class Student {
	@Value("Aarti")
	private String studentName;
	@Value("delhi")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
