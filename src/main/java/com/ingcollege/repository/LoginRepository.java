package com.ingcollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingcollege.entity.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

	public User findUserByStudentIdAndPassword(Long studentId, String password);

}
