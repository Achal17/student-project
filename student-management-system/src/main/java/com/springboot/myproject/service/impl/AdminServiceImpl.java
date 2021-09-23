package com.springboot.myproject.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.myproject.entity.Admin;
import com.springboot.myproject.entity.Student;
import com.springboot.myproject.repository.AdminRepository;
import com.springboot.myproject.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	private AdminRepository adminRepository;

	public AdminServiceImpl(AdminRepository loginRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	  public boolean saveAdmin(Admin admin){
	        try{
	            adminRepository.save(admin);
	            return true;
	        }catch (Exception e){
	            e.printStackTrace();
	            return false;
	        }
	    }

	public static boolean checkStudent(String email, String password) {
		return false;
	}
}
