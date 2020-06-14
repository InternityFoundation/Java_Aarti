package com.basepackage.bean;

public class Csv {
	private  int Id;
	private  String username;
	private  String password;
	private String job_status;
	private  String company;
	
public Csv(int id, String username, String password, String job_status, String company) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
		this.job_status = job_status;
		this.company = company;
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

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "Csv [Id=" + Id + ", username=" + username + ", password=" + password + ", job_status=" + job_status
				+ ", company=" + company + "]";
	}
	
}

