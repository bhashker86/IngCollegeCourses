package com.ingcollege.dto;

import java.io.Serializable;


public class UserDTO implements Serializable{
	
	
	private Long studentId;
	private String password;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserDTO() {
		super();
		
	}


}
