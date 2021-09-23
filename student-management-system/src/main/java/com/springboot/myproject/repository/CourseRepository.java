package com.springboot.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.myproject.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	

}
