package com.springboot.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tid;
	
	@Column(name = "teacher_name",nullable = false)
	private String teacherName;
	
	@Column(name = "teacher_email")
	private String teacherEmail;

	public Teacher(String teachername, String teacheremail) {
		super();
		this.teacherName = teachername;
		this.teacherEmail = teacheremail;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	
}
