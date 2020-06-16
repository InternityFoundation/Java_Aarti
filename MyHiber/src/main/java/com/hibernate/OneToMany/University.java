package com.hibernate.OneToMany;

import java.util.List;

import javax.persistence.*;

import com.hibernate.OneToMany.*;
@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int u_id;
	private String u_name;
	@OneToMany(mappedBy = "university",fetch = FetchType.LAZY)
	//@OneToMany(mappedBy = "university",fetch = FetchType.EAGER)
	private List<Student> student;
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public University(int u_id, String u_name, List<Student> student) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.student = student;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "University [u_id=" + u_id + ", u_name=" + u_name + ", student=" + student + "]";
	}
	
}
