package com.spring.Annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employeee {
	//three ways to use autowired annotations one with property or variable
	@Autowired 
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired one with setter 
	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}
	//@Autowired // another with constructor
	public Employeee(Address address) {
		System.out.println("Constructor called");
		this.address = address;
	}

	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employeee [address=" + address + "]";
	}

	
	
}
