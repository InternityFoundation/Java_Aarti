package com.basepackage.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Interns")
public class Csv {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	@Column(length=100)
	private  String username;
	private  String password;
	private String phone_no;
	private String job_status;
	private  String company;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getJob_status() {
		return job_status;
	}
	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Csv(String Id, String username, String password, String phone_no, String job_status, String company) {
			super();
		
		this.username =username; 
		this.password = password;
		this.phone_no = phone_no; 
		this.job_status= job_status; 
		this.company = company; 
	}
	@Override
	public String toString() {
		return "Csv [Id=" + Id + ", username=" + username + ", password=" + password + ", phone_no=" + phone_no
				+ ", job_status=" + job_status + ", company=" + company + "]";
	}
	
	
	
}
