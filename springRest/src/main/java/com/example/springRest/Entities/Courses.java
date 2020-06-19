package com.example.springRest.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courseApi")
public class Courses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private String courseName;
	private String courseDetails;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetails() {
		return courseDetails;
	}
	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	public Courses(long id, String courseName, String courseDetails) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDetails = courseDetails;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", courseDetails=" + courseDetails + "]";
	}
	
}
