package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.ContactUs;
import com.lti.service.ContactService;

@Controller
public class ContactController {

	@Autowired 
	private ContactService contactService;
	
	@RequestMapping(path="contact.lti" , method=RequestMethod.POST)
	public String Contact(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("message")String message)
	{
		contactService.add(name,email,message);
		
		return "contactus.jsp";
	}
	
}
