package com.ingcollege.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingcollege.dto.UserLoginDTO;
import com.ingcollege.dto.UserResponseDTO;
import com.ingcollege.entity.User;
import com.ingcollege.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	@Autowired
	LoginRepository loginRepository;

	@Override
	public UserResponseDTO validateLogin(UserLoginDTO UserLoginDTO) {

		logger.info(UserLoginDTO.toString());
		User user = loginRepository.findUserByStudentIdAndPassword(UserLoginDTO.getStudentId(),
				UserLoginDTO.getPassword());
		UserResponseDTO userResponseDTO = new UserResponseDTO();
		if(user==null) {
			return userResponseDTO;
		}
		logger.info(user.toString());
		
		userResponseDTO.setStudentId(user.getStudentId());
		userResponseDTO.setStudentName(user.getStudentName());

		return userResponseDTO;
	}
}
