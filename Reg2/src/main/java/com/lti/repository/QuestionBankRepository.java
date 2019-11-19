package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Courses;
import com.lti.model.QuestionBank;

@Repository
public class QuestionBankRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(QuestionBank qb) {
		
		Courses c=new Courses();
		qb.setCourses(c);
	
		
		entityManager.persist(qb);
	}

}
