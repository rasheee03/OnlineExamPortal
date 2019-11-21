package com.lti.repository;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Login;

@Repository
public class EmailRepository {
	

	@PersistenceContext
	private EntityManager entityManager;
	String uuid = UUID.randomUUID().toString();
	
	@Transactional
	public String chkEm(String em)
	{
		Login l=new Login();
		String q1 ="select a from Login a where email=:e1";
		Query q=entityManager.createQuery(q1);
		q.setParameter("e1",em);
		
		if(q.getFirstResult()>0)
		{   
			
			l.setPassword(uuid);
			entityManager.persist(l);
			return uuid;
		}
		
		else
		{
			return "user not found";
		}
		
		
	
		
		
	}

}
