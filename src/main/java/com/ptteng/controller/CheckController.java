package com.ptteng.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ptteng.dao.StudentMapper;
import com.ptteng.student.Student;

public class CheckController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentMapper mapper = (StudentMapper) context.getBean("studentMapper");
		List<Student> students = mapper.getAllStudent();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("checkEmp");
		mav.getModel().put("students", students);
		return mav;
	}

}
