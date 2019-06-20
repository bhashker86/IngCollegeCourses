package com.ingcollege.ingcollege;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ingcollege.dto.CourseDTO;
import com.ingcollege.service.CourseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseControllerTest {
	
	@Autowired	
	private MockMvc mockMvc;	
	
	@MockBean
	private CourseServiceImpl courseServiceImpl;
	
	@Test
	public void TestregisterCourse() throws Exception {
	    CourseDTO course_dto=new CourseDTO();
		
		course_dto.setStudentId(new Long(1));
		course_dto.setCourseCode("4");
		course_dto.setCourseDuration();
		course_dto.setCourseFee(course1.getCourseFee());
		course_dto.setCourseLevel(course1.getCourseLevel());
		course_dto.setCourseName(course1.getCourseName());
		course_dto.setCourseId(course1.getCourseId());
		course_dto.setCourseStartDate(course1.getCourseStartDate());
		course_dto.setProfessor(course1.getProfessor());
	
		
	}	

}
