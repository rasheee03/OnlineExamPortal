package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Login;
import com.lti.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepo;
	
	public boolean loginCheck(String email,String password) {
		
	boolean b=loginRepo.validateUser(email, password);
	return b;
	
		}
		
		
	

}
