package com.lti.controller;

import java.util.UUID;

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
	private EmailService emService;
	

	
	
	 @RequestMapping(path = "sendMail.lti", method = RequestMethod.POST)
	  public String resetPass(@RequestParam("email") String em)throws MessagingException
	 {	
		 
		String uuid = UUID.randomUUID().toString();
		boolean b= emService.setPass(em,uuid);
		
		if(b)
		   {
			
			emService.send(em, "Your temporary password", uuid);
		  }
		   
		   else
		   {
			   System.out.println("invalid");
		   }
		return "login.jsp";
		 
		 
	 }
	 
	 
		
}
