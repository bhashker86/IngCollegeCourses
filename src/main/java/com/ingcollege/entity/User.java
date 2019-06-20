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
import javax.persistence.GenerationType;



@Entity
@Table(name="user")
public class User implements Serializable{
   
	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
	private Long userId;
	@Column(name="student_id")
	private Long studentId;
	@Column(name="password")
	private String password;
	private String studentName;
	
	@OneToOne( fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="courseId")
	private Courses courses;

	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	
	
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
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public User(Long id) {
		super();
		this.id = id;
	}
	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", studentId=" + studentId + ", password=" + password + ", course=" + course + "]";
	}
}



