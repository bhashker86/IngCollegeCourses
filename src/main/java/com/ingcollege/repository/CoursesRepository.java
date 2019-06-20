package com.ingcollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingcollege.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
