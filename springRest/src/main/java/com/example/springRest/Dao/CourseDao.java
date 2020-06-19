package com.example.springRest.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springRest.Entities.Courses;

@Repository
public interface CourseDao{

		public List<Courses> getCourses();
}
