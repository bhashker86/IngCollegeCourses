package com.ingcollege.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable{
   
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	private Long id;
	@Column(name="student_id")
	private Long studentId;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
//	private Long student_id;
//	public Long getStudent_id() {
//		return student_id;
//	}
//	public void setStudent_id(Long student_id) {
//		this.student_id = student_id;
//	}
	@Column(name="password")
	private String password;
	
	@OneToOne( fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Course course;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Long id) {
		super();
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", studentId=" + studentId + ", password=" + password + ", course=" + course + "]";
	}
	


}
