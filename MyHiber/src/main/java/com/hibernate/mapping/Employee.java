package com.hibernate.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int employee_id;
	@Column(length=1500)
	private String assigned_work;
	
//	Bidirectional mapping
	@OneToOne(mappedBy = "employee")
	private OnetoOne onetoone;
	public OnetoOne getOnetoone() {
		return onetoone;
	}
	public void setOnetoone(OnetoOne onetoone) {
		this.onetoone = onetoone;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getAssigned_work() {
		return assigned_work;
	}
	public void setAssigned_work(String assigned_work) {
		this.assigned_work = assigned_work;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_id, String assigned_work) {
		super();
		this.employee_id = employee_id;
		this.assigned_work = assigned_work;
	}
	
	
}
