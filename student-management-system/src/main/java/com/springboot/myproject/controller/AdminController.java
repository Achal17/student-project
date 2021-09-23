package com.springboot.myproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.myproject.entity.Admin;
import com.springboot.myproject.entity.Student;
import com.springboot.myproject.service.AdminService;
import com.springboot.myproject.service.impl.AdminServiceImpl;
import com.springboot.myproject.service.impl.StudentServiceImpl;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;

	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String loginAdmin(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession httpSession) {
		if (httpSession.getAttribute("user").equals("admin1")) {
			if (AdminServiceImpl.checkStudent(email, password)) {
				httpSession.setAttribute("id", email);
				return "redirect:homepage";
			} else {
				return "redirect:login";
			}
		} else {
			System.out.println(StudentServiceImpl.checkStudent(email, password));
			if (StudentServiceImpl.checkStudent(email, password)) {
				httpSession.setAttribute("id", email);
				return "redirect:homepage";
			} else {
				return "redirect:login";
			}
		}
	}


}