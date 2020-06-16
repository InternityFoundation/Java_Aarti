package com.hibernate.MyHiber.basic;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity 
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name="Intern_Details")
public class Interns {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int intern_id;
	@Column(name="intern_FullName",length=100)
	private String intern_name;
	private String intern_stream;
	@Temporal(TemporalType.TIMESTAMP)
	private Date joiningDate;
	@Transient
	private int x;
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getIntern_id() {
		return intern_id;
	}
	public void setIntern_id(int intern_id) {
		this.intern_id = intern_id;
	}
	public String getIntern_name() {
		return intern_name;
	}
	public void setIntern_name(String intern_name) {
		this.intern_name = intern_name;
	}
	public String getIntern_stream() {
		return intern_stream;
	}
	public void setIntern_stream(String intern_stream) {
		this.intern_stream = intern_stream;
	}
	
	
	public Interns(int intern_id, String intern_name, String intern_stream, Date joiningDate, int x) {
		super();
		this.intern_id = intern_id;
		this.intern_name = intern_name;
		this.intern_stream = intern_stream;
		this.joiningDate = joiningDate;
		this.x = x;
	}
	public Interns() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Interns [intern_id=" + intern_id + ", intern_name=" + intern_name + ", intern_stream=" + intern_stream
				+ ", joiningDate=" + joiningDate + ", x=" + x + "]";
	}
}
