package com.springboot.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.myproject.entity.Course;
import com.springboot.myproject.entity.Student;
import com.springboot.myproject.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;

	public CourseController(CourseService courseService) {
		super();
		this.courseService = courseService;
	}
	
	//Student registration for course
	@GetMapping("/register_course")
	public String registerCourse(Model model) {
		
	return "register_course";
	}
	

	@GetMapping("/courses")
	public String listCourses(Model model) {
		model.addAttribute("course", courseService.getAllCourses());
		return "courses";
	}
	
	@GetMapping("/courses/new")
	public String createCourseForm(Model model) {
		
		Course course = new Course();
		model.addAttribute("course", course);
		return "create_course";
	}
	@PostMapping("/courses")
	public String saveCourse(@ModelAttribute("course") Course course) {
		courseService.saveCourse(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/courses/{cid}")
	public String deleteCourse(@PathVariable Long cid) {
		courseService.deleteCourseById(cid);
		return "redirect:/courses";
	}
}
