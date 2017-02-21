package com.ptteng.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptteng.student.Student;

public interface StudentMapper {
	public void addStudent(Student s);
	public void updateStudent(Student s);
	public List<Student> getAllStudent();
	public int deleteStudent(int id);
	public Student getStudentById(int id);
}
