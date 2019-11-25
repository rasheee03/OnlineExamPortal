package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Option;

import java.util.List;

@Repository
public class LevelRepository {

	@PersistenceContext
	private  EntityManager entityManager;
	
	@Transactional
	public List<Option> fetchOptionsForGivenQu(int qid, int userop)
	{
		String selectQuery = "select op from Option op where qid=:q1";
		Query q= entityManager.createQuery(selectQuery);
		q.setParameter("q1", qid);
		q.setParameter("op1", userop);
		List<Option> ops=q.getResultList();
		return ops;
		
	
		}
		
		
	}

