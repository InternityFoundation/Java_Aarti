package com.example.springRest.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springRest.Entities.Courses;

@Repository
public interface CourseService extends JpaRepository<Courses, Long>{

}
