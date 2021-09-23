package com.springboot.myproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.myproject.entity.Student;
import com.springboot.myproject.entity.Course;
import com.springboot.myproject.entity.Admin;
import com.springboot.myproject.repository.CourseRepository;
import com.springboot.myproject.repository.AdminRepository;

import com.springboot.myproject.repository.StudentRepository;
import com.springboot.myproject.repository.TeacherRepository;



@SpringBootApplication

public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Achal","Kavitkar","achal@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sonali","Pawar","sonali@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Bhagyashri","Pawade","bhagyashri@gmail.com");
//		studentRepository.save(student3);
//		
//		Course course1 = new Course("java","Neha Ghorpade");
//		courseRepository.save(course1);
//		
//		Course course2 = new Course("python","Achal Kavitkar");
//		courseRepository.save(course2);
		
		Admin admin1 = new Admin("achal@gmail.com","Achal","1234");
		adminRepository.save(admin1);

	}

}
