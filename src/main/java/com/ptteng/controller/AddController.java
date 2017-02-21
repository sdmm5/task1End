package com.ptteng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.ptteng.dao.StudentMapper;
import com.ptteng.student.Student;

public class AddController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String studentName = req.getParameter("studentName");
		String studentQq = req.getParameter("studentQq");
		String xiuzhenType = req.getParameter("xiuzhenType");
		String admissionTime = req.getParameter("admissionTime");
		String graduatedSchool = req.getParameter("graduatedSchool");
		String xianShang = req.getParameter("xianShang");
		String studentNumber = req.getParameter("studentNumber");
		String dailyUrl = req.getParameter("dailyUrl");
		String vow = req.getParameter("vow");
		String recommendedPerson = req.getParameter("recommendedPerson");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		StudentMapper mapper = (StudentMapper) context.getBean("studentMapper");
		
		Student s = new Student();
		s.setStudentName(studentName);
		s.setStudentQq(studentQq);
		s.setXiuzhenType(xiuzhenType);
		s.setAdmissionTime(admissionTime);
		s.setGraduatedSchool(graduatedSchool);
		s.setXianShang(xianShang);
		s.setStudentNumber(studentNumber);
		s.setDailyUrl(dailyUrl);
		s.setVow(vow);
		s.setRecommendedPerson(recommendedPerson);
		mapper.addStudent(s);
		
		ModelAndView mav = new ModelAndView();
		req.getRequestDispatcher("checkEmp.do").forward(req, res);
		return mav;
	}

}
