package com.spring.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("INside init works as init method  of pepsi");
		
	}

	public void destroy() throws Exception {
		System.out.println("INside destroy works as destroy method of pepsi");

		
	}
	
}
