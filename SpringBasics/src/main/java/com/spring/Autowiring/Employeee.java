package com.spring.Autowiring;

public class Employeee {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employeee(Address address) {
		System.out.println("COnstructor called");
		
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
