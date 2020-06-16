package com.spring.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
	
	private List<String> friends;
	private Map<String,Integer> feeStructure; 
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	
	

	@Override
	public String toString() {
		return "Employees [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	
}
