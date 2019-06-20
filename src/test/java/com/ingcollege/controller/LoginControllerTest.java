package com.ingcollege.controller;

	import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ingcollege.dto.UserLoginDTO;
import com.ingcollege.dto.UserResponseDTO;
import com.ingcollege.entity.User;
import com.ingcollege.service.LoginService;

	@RunWith(SpringRunner.class)
	@WebMvcTest(value = LoginController.class)
	public class LoginControllerTest {
		@Autowired
		MockMvc mockMvc;

		@MockBean
		LoginService loginService;
		/*@Before
		public void setUp() {
			
			
			this.mockMvc = MockMvcBuilders.standaloneSetup(new LoginController()).build();
		}*/
		@Test
		public void getLogin() throws Exception {
			UserResponseDTO  userResponseDTO = new UserResponseDTO();
			User user =  new User();
			userResponseDTO.setStudentId(1234L);
			userResponseDTO.setStudentName("vasavi");
			UserLoginDTO userLoginDto = new UserLoginDTO();
			Mockito.when(loginService.validateLogin(userLoginDto)).thenReturn(userResponseDTO);

			mockMvc.perform(post("/api/login").contentType(MediaType.APPLICATION_JSON).content(asJsonString(user)))
					.andExpect(status().isOk());
			
		}

		public static String asJsonString(final Object obj) {
			try {
				return new ObjectMapper().writeValueAsString(obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

