package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class EmailRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public boolean checkUser(String em)

	{
		String q1 ="select e from Login e where email=:e1";
		Query q=entityManager.createQuery(q1);
		q.setParameter("e1",em);
		
		Number o=(Number)q.getSingleResult();
		if(o.intValue()>0) {
			return true;
		}
		else
		{
			return false;
		}

	
	}
}
