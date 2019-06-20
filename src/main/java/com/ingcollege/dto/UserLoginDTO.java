package com.ingcollege.dto;

public class UserLoginDTO {
 private Long studentId;
 private String password;
 
@Override
public String toString() {
	return "UserLoginDTO [studentId=" + studentId + ", password=" + password + "]";
}
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
 
}
