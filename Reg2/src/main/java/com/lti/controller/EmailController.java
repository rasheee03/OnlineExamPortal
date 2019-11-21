package com.lti.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.service.EmailService;

@Controller
public class EmailController {

	@Autowired 
	private EmailService emailService;
	@RequestMapping(path="generatePass.lti",method = RequestMethod.POST)
	public String forgotPass(@RequestParam("email")String em) throws MessagingException
	{
		emailService.check(em);
		return "login.jsp";
	}
}
