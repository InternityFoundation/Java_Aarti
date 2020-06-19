package com.example.springRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springRest.Entities.Courses;
import com.example.springRest.services.CourseService;
import com.spring.example.Exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api")
public class SpringController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//Get course Details
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		//return this.courseService.getCourses();
		return this.courseService.findAll();
		
	}
	
	//get course by id
	@GetMapping("/courses/{courseId}")
	public Courses getCourseById(@PathVariable (value = "courseId" ) long courseId) {
		
		//return this.courseService.getCourseById(Long.parseLong(courseId));
		return this.courseService.findById(courseId).orElseThrow(()-> 
		new ResourceNotFoundException("User not foung with id ::"+courseId));
	}
	
	//Add a course by using post
	@PostMapping("/courses")
	public Courses addCourse( @RequestBody Courses course) {
		// return this.courseService.addCourse(course);
		 return this.courseService.save(course);
	}

	
	@PutMapping("/courses/{courseId}")
	public Courses updateCourse(@RequestBody Courses course, @PathVariable("courseId") long courseId) {
		
		//return this.courseService.updateCourse(course);
		Courses existingCourse = this.courseService.findById(courseId).orElseThrow(()-> 
		new ResourceNotFoundException("User not foung with id ::"+courseId));
		existingCourse.setCourseName(course.getCourseName());
		existingCourse.setCourseDetails(course.getCourseDetails());
		 return this.courseService.save(existingCourse);
	}
	
	//Delete a course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<Courses> deleteCourse(@PathVariable ("courseId") long courseId ){
		try {
			Courses existingCourse = this.courseService.findById(courseId).orElseThrow(()-> 
			new ResourceNotFoundException("User not foung with id ::"+courseId));
			this.courseService.delete(existingCourse);
			return ResponseEntity.ok().build();
		}
		catch(Exception e) {
			return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}

