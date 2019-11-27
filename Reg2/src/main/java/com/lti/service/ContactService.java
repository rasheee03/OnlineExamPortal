package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.ContactUs;
import com.lti.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	public void add(String name,String email,String message) {
		
	contactRepo.addContact(name,email,message);

	
		}
}
