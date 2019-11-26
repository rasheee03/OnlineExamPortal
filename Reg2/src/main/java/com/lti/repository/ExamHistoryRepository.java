package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.lti.model.ExamHistory;

@Repository
public class ExamHistoryRepository{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<ExamHistory> get(int lid)
	{
		String s="select eh from ExamHistory eh where eh.lid=:lid";
		Query q= entityManager.createQuery(s);
		q.setParameter("lid", lid);
		List<ExamHistory> eh=q.getResultList();
		return eh;
		
		
	}
	
	
	 public ExamHistory add(ExamHistory c) {
	        entityManager.persist(c);
	        return c;
	    }

}
