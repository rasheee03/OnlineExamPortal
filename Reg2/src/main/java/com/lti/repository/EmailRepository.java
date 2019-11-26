package com.lti.repository;

import java.util.List;

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
	@Transactional
	public boolean checkUser(String em,String uuid)

	{   
		String q1 ="select e from Login e where email=:e1";
		Query q=entityManager.createQuery(q1);
		q.setParameter("e1",em);
		Login l=(Login) q.getSingleResult();
		if(l!=null)
		{
			l.setPassword(uuid);
			entityManager.merge(l);
			return true;
		}
		else
		{
			return false;
		}
	}
		
	
	
}
