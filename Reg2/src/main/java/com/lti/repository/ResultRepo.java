package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.model.ExamResult;


@Repository
public class ResultRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<ExamResult> fetchResult(int cid)
	{
		
			String q1 ="select e from ExamResult e where e.course.cid=:cid";
			Query q=entityManager.createQuery(q1);
			q.setParameter("cid",cid);
			//q.setParameter("l1",lid);
			
			List<ExamResult> list=q.getResultList();
			System.out.println("repo"+list.size());
			return list;

			
	}

}
