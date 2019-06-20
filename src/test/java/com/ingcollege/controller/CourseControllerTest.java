package com.ingcollege.ingcollege;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingcollege.controller.CourseController;
import com.ingcollege.dto.CourseDTO;
import com.ingcollege.service.CourseService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CourseControllerTest.class, secure = false)
public class CourseControllerTest {

	@Autowired
	MockMvc mockMvc;

	@InjectMocks
	CourseController pc;

	@Mock
	CourseService coursesService;

	@Test
	public void testRegisterCourse() throws Exception {
		CourseDTO courseDto = new CourseDTO();

		courseDto.setCourseId(1L);
		courseDto.setCourseName("Big Data");
		courseDto.setCourseCode("BD1167");
		courseDto.setCourseDuration("6 Months");
		courseDto.setCourseLevel("Advance Beginner");
		courseDto.setProfessor("Dr.Jason Daniel");
		courseDto.setCourseFee(new Long(7888));
		courseDto.setCourseStartDate(null);
		courseDto.setStudentId(1L);
		courseDto.setCourseId(1L);
		when(coursesService.registerCourse(1L, 1L)).thenReturn(courseDto);
		CourseDTO test = pc.registerCourse(1L, 1L).getBody();
		assertEquals(courseDto.getStudentId(), test.getStudentId());
		assertEquals(courseDto.getCourseId(), test.getCourseId());

		assertEquals(courseDto.getCourseDuration(), test.getCourseDuration());

		assertEquals(courseDto.getCourseFee(), test.getCourseFee());

		assertEquals(courseDto.getProfessor(), test.getProfessor());
		assertEquals(courseDto.getCourseLevel(), test.getCourseLevel());
		assertEquals(courseDto.getCourseStartDate(), test.getCourseStartDate());
		assertEquals(courseDto.getCourseCode(), test.getCourseCode());

		Mockito.verify(coursesService, Mockito.times(1)).registerCourse(1L, 1L);
	}

	protected String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

	protected <T> T mapFromJson(String json, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json, clazz);
	}

}
