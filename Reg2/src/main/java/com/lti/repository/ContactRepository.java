package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.ContactUs;

@Repository
public class ContactRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
@Transactional
	public void addContact(String name,String email,String message)
	{
	ContactUs c=new ContactUs();
	c.setName(name);
	c.setEmail(email);
	c.setMessage(message);
	entityManager.persist(c);
		
			
	}
}
