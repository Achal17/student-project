package com.springboot.myproject.service;

import java.util.List;

import com.springboot.myproject.entity.Course;


public interface CourseService {
	Course registerCourse(Course course);

	List<Course> getAllCourses();
	
	Course saveCourse(Course course);

	void deleteCourseById(Long cid);

	

	
}
