package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Course;
import com.lti.model.Question;

@Repository
public class QuestionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Question qb) {
		
		entityManager.persist(qb);
	}
	


}
