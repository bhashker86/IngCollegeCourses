 package com.ingcollege.controller;


import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@WebMvcTest(value=CoursesControllerTest.class,secure=false)
public class CoursesControllerTest {
	/*
	 * 
	 * @Autowired MockMvc mockMvc;
	 * 
	 * @Mock CoursesService coursesService;
	 * 
	 * @InjectMocks CoursesController pc;
	 * 
	 * @Test public void testgetAllCourses() throws Exception{ CoursesDTO coursesDto
	 * = new CoursesDTO();
	 * 
	 * coursesDto.setCourseId(1L); coursesDto.setCourseName("Big Data");
	 * coursesDto.setCourseCode("BD1167"); coursesDto.setCourseDuration("6 Months");
	 * coursesDto.setCourseLevel( "Advance Beginner"); coursesDto.setProfessor(
	 * "Dr.Jason Daniel"); coursesDto.setCourseFee(0.0);
	 * coursesDto.setCourseStartDate("26-06-2019"); List<CoursesDTO> coursesDtos =
	 * new ArrayList<>();
	 * 
	 * coursesDtos.add(coursesDto);
	 * 
	 * 
	 * Mockito.when(coursesService.findAllCourses()).thenReturn(coursesDtos);
	 * List<CoursesDTO> test = pc.getAllCourses().getBody();
	 * assertEquals(coursesDto.getCourseName(), test.get(0).getCourseName());
	 * assertEquals(coursesDto.getCourseDuration(),
	 * test.get(0).getCourseDuration()); assertEquals(coursesDto.getCourseFee(),
	 * test.get(0).getCourseFee()); assertEquals(coursesDto.getCourseId(),
	 * test.get(0).getCourseId()); assertEquals(coursesDto.getProfessor(),
	 * test.get(0).getProfessor()); assertEquals(coursesDto.getCourseLevel(),
	 * test.get(0).getCourseLevel()); assertEquals(coursesDto.getCourseStartDate(),
	 * test.get(0).getCourseStartDate()); assertEquals(coursesDto.getCourseCode(),
	 * test.get(0).getCourseCode());
	 * 
	 * Mockito.verify(coursesService, Mockito.times(1)).findAllCourses(); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * protected String mapToJson(Object obj) throws JsonProcessingException {
	 * ObjectMapper objectMapper = new ObjectMapper(); return
	 * objectMapper.writeValueAsString(obj); }
	 * 
	 * protected <T> T mapFromJson(String json, Class<T> clazz) throws
	 * JsonParseException, JsonMappingException, IOException {
	 * 
	 * ObjectMapper objectMapper = new ObjectMapper(); return
	 * objectMapper.readValue(json, clazz); }
	 */}
