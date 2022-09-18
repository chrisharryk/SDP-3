package com.mrs.controller;

import java.util.List;

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
	@RequestMapping("studentlogincheck")
	public ModelAndView Studentlogin(Student s)
	{
		ModelAndView m=new ModelAndView();
		List<Student> l=repo.findAll();
		for(Student k:l)
		{
			String a=k.getUserID();
			String b=s.getUserID();
			String c=k.getPassword();
			String d=s.getPassword();
			if(a==b)
			{
	             if(c==d)
				{
					
					String x="LOGIN SUCESSFUL WITH ID";
					
					m.addObject("res",x);
				}
	             else
	             {
	            	 m.addObject("res","LOGIN FAIL Wrong password");
	         		
	         		m.setViewName("result.jsp");
	         		return m;
	             }
			}
			
		}
		//m.addObject(re);
		m.addObject("res","LOGIN FAIL");
		
		m.setViewName("result.jsp");
		return m;
	}

}
