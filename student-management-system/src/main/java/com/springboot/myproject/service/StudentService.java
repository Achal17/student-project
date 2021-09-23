package com.springboot.myproject.service;

import java.util.List;

import com.springboot.myproject.entity.Student;

public interface StudentService {
	
	Student loginStudent(Student student);
	
	Student registerStudent(Student student);
	
	Student homePage(Student student);

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	
}
