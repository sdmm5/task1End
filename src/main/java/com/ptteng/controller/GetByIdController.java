package com.ptteng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ptteng.dao.StudentMapper;
import com.ptteng.student.Student;

public class GetByIdController implements Controller{
	
	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentMapper mapper = (StudentMapper) context.getBean("studentMapper");
		
		Student s = mapper.getStudentById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("emp",s);
		mav.setViewName("loadEmp");
		
		
		
		return mav;
	}

}
