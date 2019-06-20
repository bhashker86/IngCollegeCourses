package com.ingcollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingcollege.dto.CourseDTO;

import com.ingcollege.service.CourseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders= {"*", "*/"}, origins = {"*", "*/"})
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	
    @PostMapping(value="/register/{studentId}/{courseId}")
	public ResponseEntity<CourseDTO> registerCourse(@PathVariable("studentId") Long studentId,@PathVariable("courseId") Long  courseId )
	  {
    	   	   	
    	return new ResponseEntity<>(courseService.registerCourse(studentId,courseId),HttpStatus.OK);
	 }
	

	
}
