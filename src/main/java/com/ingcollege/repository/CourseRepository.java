package com.ingcollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ingcollege.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{

 @Query(value="select c from Course c where c.courseId=?1")
 public Course findByCourseId(Long courseId);	
	
}
