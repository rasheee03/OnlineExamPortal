package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired 
	private EmailRepository emailRepo;
	
	
	public void cu(String em)
	{
		emailRepo.checkUser(em);
	}

}
