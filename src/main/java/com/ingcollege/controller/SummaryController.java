package com.ingcollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingcollege.dto.RegisterCoursesDTO;
import com.ingcollege.service.SummaryService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","*/"},origins = {"*","*/"})
public class SummaryController {
	
	@Autowired
	private SummaryService summaryService;
	
	@GetMapping(value = "/summary/{studentId}")
	public ResponseEntity<RegisterCoursesDTO> summary(@PathVariable("studentId") Long studentId){
		RegisterCoursesDTO registerCoursesDTO = summaryService.summary(studentId);
		return new ResponseEntity<>(registerCoursesDTO, HttpStatus.OK);
	}
	
}
