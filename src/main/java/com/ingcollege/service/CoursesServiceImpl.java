package com.ingcollege.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ingcollege.dto.CoursesDTO;
import com.ingcollege.entity.Courses;
import com.ingcollege.repository.CoursesRepository;


@Service
@Transactional

public class CoursesServiceImpl implements CoursesService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoursesServiceImpl.class);
	
	@Autowired
	private CoursesRepository coursesRepository;



	public List<CoursesDTO> findAllCourses() {
		LOGGER.debug("findAllCourses");
		List<CoursesDTO> coursesDtos = new ArrayList<>();
		List<Courses> courses = coursesRepository.findAll();
		for(Courses course:courses) {
			CoursesDTO coursesDto = new CoursesDTO();
			BeanUtils.copyProperties(course, coursesDto);
			coursesDtos.add(coursesDto);
		}
		return coursesDtos;
	}

}
