package com.ingcollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ingcollege.entity.User;

@Repository
public interface UserRepositroy extends JpaRepository<User,Long>{

 //@Query("select u from user u where u.studentId=?1")	
 //public User findByStudent_id(Long studentId);	
	public User findByStudentId(Long studentId);
}
