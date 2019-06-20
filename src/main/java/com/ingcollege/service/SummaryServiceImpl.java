package com.ingcollege.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingcollege.dto.RegisterCoursesDTO;
import com.ingcollege.entity.Course;
import com.ingcollege.entity.User;
import com.ingcollege.repository.SummaryRepository;

@Service
public class SummaryServiceImpl implements SummaryService{
	
	@Autowired
	SummaryRepository summaryRepository;
	public RegisterCoursesDTO summary(Long studentId){
		User user = summaryRepository.findByStudentId(studentId);
		Course courses = user.getCourse();
		RegisterCoursesDTO registerCoursesDTO = new RegisterCoursesDTO();
		registerCoursesDTO.setStudentId(user.getStudentId());
		BeanUtils.copyProperties(courses, registerCoursesDTO);
		return registerCoursesDTO;
	}
}
