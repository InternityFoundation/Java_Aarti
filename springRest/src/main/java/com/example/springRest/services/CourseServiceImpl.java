//package com.example.springRest.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.example.springRest.Entities.Courses;
//
//
//@Service
//public class CourseServiceImpl implements CourseService {
//
//	List<Courses> list;
//	public CourseServiceImpl() {
//		
//		list = new ArrayList<>();
//		list.add(new Courses(1, "JAVA", "CORE JAVA TUTORIAL"));
//		list.add(new Courses(2, "SPRING", "SPRING CORE TUTORIAL"));
//		list.add(new Courses(3, "REST", "REST JAVA TUTORIAL"));
//	}
//	@Override
//	public List<Courses> getCourses() {
//		
//		return list;
//		
//	}
//	@Override
//	public Courses getCourseById(long courseId) {
//	
//		
//		Courses c = null;
//		for(Courses course : list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
//	}
//	@Override
//	public Courses addCourse(Courses course) {
//		list.add(course);
//		return course;
//	}
//	
//	@Override
//	public Courses updateCourse(Courses course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setId(course.getId());
//				e.setCourseName(course.getCourseName());
//			e.setCourseDetails(course.getCourseDetails());
//			}
//		});
//		
//		
//		return course;
//	}
//	@Override
//	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
//		
//	}
//
//	
//}
