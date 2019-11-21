package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.model.Login;

@Repository
public class LoginRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	public boolean validateUser(String email,String password)
	{
		
			String q1 ="select count(a) from Login a where email=:e1 and password=:p1";
			Query q=entityManager.createQuery(q1);
			q.setParameter("e1",email);
			q.setParameter("p1",password);
			
			Number o=(Number)q.getSingleResult();
			if(o.intValue()>0) {
				return true;
			}
			else {
				return false;
			}

			
	}

}
