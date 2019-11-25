package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.model.Registration;
import com.lti.service.CourseService;
import com.lti.service.QuestionService;
import com.lti.service.RegistrationService;

@Controller("/register")
public class RegistrationController {


	@Autowired
	private RegistrationService regService;

//	@Autowired 
//	private QuestionService queService;
//	
//	@Autowired
//	private CourseService courseService;
	
	
	 @RequestMapping(path="register.lti", method=RequestMethod.POST)
	 public String register(Registration r)
	    {
	    	regService.register(r);
	    	return "home.jsp";
	}

	
	
}

