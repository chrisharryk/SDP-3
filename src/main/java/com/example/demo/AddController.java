package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@Autowired
	RecruiterRepo repo;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/home")
	public String home()
	{
		return "cmplgn.jsp";
	}
	
	@RequestMapping("reclogin")
	public ModelAndView RecLogin(String username,String pass)
	{
		ModelAndView mv = new ModelAndView();
		List<Recruiter> rc = repo.findAll();
		for(int i=0;i<repo.count();i++)
		{
			Recruiter r = rc.get(i);
			if((r.getUsername().equals(username))&&r.getPassword().equals(pass))
			{
					mv.setViewName("index.jsp");
					return mv;
			}
		}
		mv.setViewName("cmplgn.jsp");
		return mv;	
	}
	
}
