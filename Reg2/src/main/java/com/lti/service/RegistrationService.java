package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Registration;
import com.lti.repository.RegistrationRepository;

@Service
public class RegistrationService {


	@Autowired
	private RegistrationRepository regRepo;
	
	public void register(Registration reg) {
		regRepo.add(reg);
}
}

