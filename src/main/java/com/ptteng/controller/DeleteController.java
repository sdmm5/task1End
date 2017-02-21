package com.ptteng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ptteng.dao.StudentMapper;

public class DeleteController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(req.getParameter("id"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentMapper mapper = (StudentMapper) context.getBean("studentMapper");
		mapper.deleteStudent(id);
		
		ModelAndView mav = new ModelAndView();
		res.sendRedirect("checkEmp.do");
		
		return null;
	}

}
