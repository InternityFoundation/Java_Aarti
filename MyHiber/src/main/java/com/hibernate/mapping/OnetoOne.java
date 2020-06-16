package com.hibernate.mapping;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "onetoone")
public class OnetoOne {
	@Id
	private int id;
	private String name;
	@Transient
	private String work;
	@OneToOne
	@JoinColumn(name="e_id")
	private Employee employee;
	public int getId() { 
		  return id; 
		  } 
	  public void setId(int id) {
		  this.id = id; 
		  }
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public OnetoOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnetoOne(int id, String name, String work, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.work = work;
		this.employee = employee;
	}

}
