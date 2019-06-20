package com.ingcollege.service;

import java.util.List;

import com.ingcollege.dto.CourseDTO;

public interface CourseService {

	public List<CourseDTO> findAllCourses();

	public CourseDTO registerCourse(Long studentId, Long courseId);
}
