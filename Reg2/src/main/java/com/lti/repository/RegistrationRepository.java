package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Login;
import com.lti.model.Registration;

@Repository
public class RegistrationRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Registration r) {
//		 r=new Registration();
		Login l=new Login();
		l.setEmail(r.getEmail());
		l.setPassword(r.getPassword());
		l.setRegistration(r);
		r.setLogin(l);
		
		entityManager.persist(r);
	}
}
