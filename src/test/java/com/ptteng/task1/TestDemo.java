package com.ptteng.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ptteng.dao.StudentMapper;
import com.ptteng.student.Student;

public class TestDemo {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentMapper mapper = (StudentMapper) context.getBean("studentMapper");
		Student s = new Student();
		s.setStudentName("maweijiang");
		s.setStudentQq("1234");
		mapper.addStudent(s);
	}
	
}
