package com.springboot.myproject.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.myproject.entity.Student;
import com.springboot.myproject.repository.StudentRepository;
import com.springboot.myproject.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public Student loginStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student registerStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student homePage(Student student) {
		return studentRepository.save(student);
	}

	public static boolean checkStudent(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
