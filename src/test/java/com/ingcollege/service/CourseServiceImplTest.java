package com.ingcollege.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ingcollege.dto.CourseDTO;
import com.ingcollege.entity.Course;
import com.ingcollege.repository.CourseRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {

	@InjectMocks
	CourseServiceImpl coursesServiceImpl;

	@Mock
	CourseRepository coursesRepository;

	@Test
	public void testFindAllCourses() {
		List<Course> courses = new ArrayList<>();
		Course course = new Course();

		course.setCourseId(1L);
		course.setCourseName("Big Data");
		course.setCourseCode("BD1167");
		course.setCourseDuration("6 Months");
		course.setCourseLevel("Advance Beginner");
		course.setProfessor("Dr.Jason Daniel");
		course.setCourseFee(0L);
		course.setCourseStartDate(null);
		courses.add(course);
		when(coursesRepository.findAll()).thenReturn(courses);
		List<CourseDTO> coursesDtos = coursesServiceImpl.findAllCourses();

		
		assertEquals(course.getCourseName(), coursesDtos.get(0).getCourseName());
		assertEquals(course.getCourseDuration(), coursesDtos.get(0).getCourseDuration());
		assertEquals(course.getCourseFee(), coursesDtos.get(0).getCourseFee());
		assertEquals(course.getCourseId(), coursesDtos.get(0).getCourseId());
		assertEquals(course.getProfessor(), coursesDtos.get(0).getProfessor());
		assertEquals(course.getCourseLevel(), coursesDtos.get(0).getCourseLevel());
		assertEquals(course.getCourseStartDate(), coursesDtos.get(0).getCourseStartDate());
		assertEquals(course.getCourseCode(), coursesDtos.get(0).getCourseCode());
	}

}
