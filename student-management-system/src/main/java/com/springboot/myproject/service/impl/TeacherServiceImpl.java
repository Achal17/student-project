package com.springboot.myproject.service.impl;


import org.springframework.stereotype.Service;

import com.springboot.myproject.entity.Teacher;
import com.springboot.myproject.repository.TeacherRepository;
import com.springboot.myproject.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService{
	
private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public Teacher loginTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

}
