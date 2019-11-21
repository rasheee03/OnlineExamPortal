package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Courses;
import com.lti.model.Options;
import com.lti.model.QuestionBank;
import com.lti.model.Registration;
import com.lti.service.CourseService;
import com.lti.service.LoginService;
import com.lti.service.QuestionService;
import com.lti.service.RegistrationService;

@Controller
public class RegistrationController {


	@Autowired
	private RegistrationService regService;
	
	@Autowired
	private LoginService logService;
	
	@Autowired 
	private QuestionService queService;
	
	@Autowired
	private CourseService courseService;
	
	//================================================================
	
	 @RequestMapping(path="register.lti", method=RequestMethod.POST)
	 public String register(Registration r)
	    {
	    	regService.register(r);
	    	return "home.jsp";
	}

	//================================================================
	 
	 @RequestMapping(path = "login.lti", method = RequestMethod.POST)
	  public String Login(@RequestParam("email") String em,@RequestParam("password") String pw)
	 {
	   boolean b= logService.loginCheck(em, pw);
	   if(b)
	   {
	    return "home.jsp";
	  }
	   
	   else
	   {
		   return "login.jsp";
	   }
	 
	 }
	 
		//================================================================
	 
	 @RequestMapping(path = "question.lti", method = RequestMethod.POST)
	 private String addQuestions(QuestionBank qb)
	 {	 
		 
		 
    	 queService.addQuest(qb);
//		 queService.addOptions(op);
//		 queService.addCourse(c);
		 
		 return "AddQuestions.jsp";
	 }
}

