package com.mrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mrs.dao.StudentRepo;
import com.mrs.pojo.Student;

@Controller
public class Controller1
{
	@Autowired
	StudentRepo repo;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView m=new ModelAndView();
		
		m.setViewName("index.jsp");
		return m;
	}
//	@RequestMapping("login")
//	public ModelAndView addStudent(Student s)
//	{
//		ModelAndView m=new ModelAndView();
//		repo.save(s);
//		String re="added";
//		//m.addObject(re);
//		m.addObject(re);
//		return m;
//	}
	@RequestMapping("studentreg")
	public ModelAndView addStudent(Student s)
	{
		ModelAndView m=new ModelAndView();
		repo.save(s);
		String re="added";
		//m.addObject(re);
		m.addObject("res",re);
		
		m.setViewName("result.jsp");
		return m;
	}

}
