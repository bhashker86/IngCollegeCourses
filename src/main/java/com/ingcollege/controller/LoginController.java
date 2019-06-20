package com.ingcollege.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ingcollege.dto.UserLoginDTO;
import com.ingcollege.dto.UserResponseDTO;
import com.ingcollege.service.LoginService;


@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders= {"*", "*/"}, origins = {"*", "*/"})
public class LoginController {
	@Autowired
	private LoginService loginService;
	@PostMapping("/login")
	public ResponseEntity<UserResponseDTO> validateLogin(@RequestBody UserLoginDTO UserLoginDTO) {
		
		UserResponseDTO userResponseDTO = loginService.validateLogin(UserLoginDTO);
		//if(userResponseDTO==null)
			//return new ResponseEntity<>(userResponseDTO, HttpStatus.PRECONDITION_FAILED);
			
		return new ResponseEntity<>(userResponseDTO, HttpStatus.OK);
	}
	

}
