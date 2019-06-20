package com.ingcollege.service;

import com.ingcollege.dto.UserLoginDTO;
import com.ingcollege.dto.UserResponseDTO;

public interface LoginService {
	 public UserResponseDTO validateLogin(UserLoginDTO UserLoginDTO);
}
