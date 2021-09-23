package com.springboot.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.myproject.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Object>{

}
