package com.springboot.myproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.myproject.entity.Course;
import com.springboot.myproject.entity.Student;
import com.springboot.myproject.repository.CourseRepository;
import com.springboot.myproject.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}
	
	@Override
	public Course registerCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}
	
	@Override
	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourseById(Long cid) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(cid);
	}
	
}
