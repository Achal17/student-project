package com.springboot.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.myproject.entity.Course;
import com.springboot.myproject.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
