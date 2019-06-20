package com.ingcollege.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class CoursesDTO  {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	private String courseCode;
	private String courseDuration;
	private String courseLevel;
	private String professor;
	private Double courseFee;
	private String courseStartDate;
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseLevel() {
		return courseLevel;
	}
	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	@Override
	public String toString() {
		return "CoursesDto [courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode
				+ ", courseDuration=" + courseDuration + ", courseLevel=" + courseLevel + ", professor=" + professor
				+ ", courseFee=" + courseFee + ", courseStartDate=" + courseStartDate + "]";
	}
	public CoursesDTO(Long courseId, String courseName, String courseCode, String courseDuration, String courseLevel,
			String professor, Double courseFee, String courseStartDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.courseDuration = courseDuration;
		this.courseLevel = courseLevel;
		this.professor = professor;
		this.courseFee = courseFee;
		this.courseStartDate = courseStartDate;
	}
	public CoursesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}