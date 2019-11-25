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
	
	public List<ExamHistory> get(int c1)
	{
		String s="select eh from ExamHistory eh where cid=:c";
		Query q= entityManager.createQuery(s);
		q.setParameter("c", c1);
		List<ExamHistory> eh=q.getResultList();
		return eh;
		
		
	}

}
