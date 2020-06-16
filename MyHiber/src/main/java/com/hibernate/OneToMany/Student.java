package com.hibernate.OneToMany;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;
	private String s_name;
	private String s_branch;
	@ManyToOne
	private University university;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_branch=" + s_branch + ", university=" + university
				+ "]";
	}
	public Student(int s_id, String s_name, String s_branch, University university) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_branch = s_branch;
		this.university = university;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_branch() {
		return s_branch;
	}
	public void setS_branch(String s_branch) {
		this.s_branch = s_branch;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	

}
