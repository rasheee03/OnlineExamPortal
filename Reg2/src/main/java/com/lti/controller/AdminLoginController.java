package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.service.LoginService;

@Controller
public class AdminLoginController {

	
	@Autowired
	private LoginService logService;
	
	
	
	 @RequestMapping(path = "adminlogin.lti", method = RequestMethod.POST)
	  public String Login(@RequestParam("email") String em,@RequestParam("password") String pw)
	 {
	   boolean b= logService.loginCheck(em, pw);
	   if(b)
	   {
	    return "adminhome.jsp";
	  }
	   
	   else
	   {
		   return "login.jsp";
	   }
	 
	 }
}
