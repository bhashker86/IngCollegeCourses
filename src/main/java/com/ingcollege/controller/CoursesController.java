package com.ingcollege.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingcollege.dto.CourseDTO;
import com.ingcollege.service.CourseService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders={"*", "*/"}, origins={"*", "*/"})
public class CoursesController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CoursesController.class);

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public ResponseEntity<List<CourseDTO>> getAllCourses(){
		LOGGER.debug("getAllCourses");
		List<CourseDTO> coursesDto = courseService.findAllCourses();
		return new ResponseEntity<>(coursesDto, HttpStatus.OK);
	}

	

}