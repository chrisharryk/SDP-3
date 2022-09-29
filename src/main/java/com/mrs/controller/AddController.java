package com.mrs.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.mrs.dao.JobOfferRepo;
import com.mrs.dao.RecruiterRepo;
import com.mrs.pojo.JobOffers;
import com.mrs.pojo.Recruiter;
@Controller

public class AddController {

  @Autowired
  RecruiterRepo repo;
  @Autowired
  HttpSession session;
  
  @Autowired
  JobOfferRepo jobrepo;
  
  String username=null;
  @RequestMapping("/home")
  public String home()
  {
    return "cmplgn.jsp";
  }
  
  @RequestMapping("recramalogin")
  public ModelAndView RecLogin(String username,String pass)
  {
    ModelAndView mv = new ModelAndView();
    List<Recruiter> rc = repo.findAll();
    for(int i=0;i<repo.count();i++)
    {
      Recruiter r = rc.get(i);
      if((r.getUsername().equals(username))&&r.getPassword().equals(pass))
      {
        this.username=username;
        session.setAttribute("loggedInUser_userName", username);
          mv.setViewName("index1rama.jsp");
          return mv;
      }
    }
    mv.setViewName("cmplgn.jsp");
    return mv;  
  }
  @RequestMapping("/logout")
    public String logout(HttpServletRequest request){
    HttpSession session = request.getSession(false);
    
      if (session != null) {
          session.invalidate();
      }
        return "cmplgn.jsp";
    }
  
  @RequestMapping("addjob")
  public ModelAndView addJob(JobOffers j)
  {
    Recruiter r=new Recruiter();
    ModelAndView mv= new ModelAndView();
    j.setPostedbyusername(username);
    jobrepo.save(j);
    mv.setViewName("index.jsp");
    System.out.println(j.getJobid());
    System.out.println(j.getPostedbyusername());
    return mv;
    
    
    
  }
  
}