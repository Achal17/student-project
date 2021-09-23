package com.springboot.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.myproject.entity.Student;
import com.springboot.myproject.entity.Teacher;
import com.springboot.myproject.service.StudentService;
import com.springboot.myproject.service.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	//Login as a student
	@GetMapping("/teacherlogin")
	public String loginStudent(Model model) {
		Teacher teacher = new Teacher();
		model.addAttribute("teacher", teacher);
		return "teacherlogin"; 
	}
}
