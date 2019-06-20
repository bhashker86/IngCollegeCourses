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

import com.ingcollege.dto.CoursesDTO;
import com.ingcollege.service.CoursesService;
@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders={"*", "*/"}, origins={"*", "*/"})
public class CoursesController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CoursesController.class);

	@Autowired
	private CoursesService coursesService;
	
	@GetMapping("/courses")
	public ResponseEntity<List<CoursesDTO>> getAllCourses(){
		LOGGER.debug("getAllCourses");
		List<CoursesDTO> coursesDto = coursesService.findAllCourses();
		return new ResponseEntity<>(coursesDto, HttpStatus.OK);
	}

	

}