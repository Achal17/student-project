package com.springboot.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.myproject.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

	

}
