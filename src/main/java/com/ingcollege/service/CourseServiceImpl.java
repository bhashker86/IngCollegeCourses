package com.ingcollege.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingcollege.dto.CourseDTO;
import com.ingcollege.entity.Course;
import com.ingcollege.entity.User;
import com.ingcollege.exception.CourseNotFoundException;
import com.ingcollege.exception.UserNotFoundException;
import com.ingcollege.repository.CourseRepository;
import com.ingcollege.repository.UserRepositroy;
import com.ingcollege.service.CourseService;

@Service 
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private UserRepositroy userRepositroy;
	
	public List<CourseDTO> findAllCourses() {
		//LOGGER.debug("findAllCourses");
		List<CourseDTO> courseDtos = new ArrayList<>();
		List<Course> courses = courseRepository.findAll();
		for(Course course:courses) {
			CourseDTO courseDto = new CourseDTO();
			BeanUtils.copyProperties(course, courseDto);
			courseDtos.add(courseDto);
		}
		return courseDtos;
	}
	
	
	
	public CourseDTO registerCourse( Long studentId, Long  courseId)   {
	
		
		User user=userRepositroy.findByStudentId(studentId);
				
		Course course=courseRepository.findByCourseId(courseId);
		user.setCourse(course);
		userRepositroy.save(user);
		
		Course course1=courseRepository.findByCourseId(courseId);
		
		CourseDTO course_dto=new CourseDTO();
		
		course_dto.setStudentId(user.getStudentId());
		course_dto.setCourseCode(course1.getCourseCode());
		course_dto.setCourseDuration(course1.getCourseDuration());
		course_dto.setCourseFee(course1.getCourseFee());
		course_dto.setCourseLevel(course1.getCourseLevel());
		course_dto.setCourseName(course1.getCourseName());
		course_dto.setCourseId(course1.getCourseId());
		course_dto.setCourseStartDate(course1.getCourseStartDate());
		course_dto.setProfessor(course1.getProfessor());
		
		return course_dto;
	
	}

}
