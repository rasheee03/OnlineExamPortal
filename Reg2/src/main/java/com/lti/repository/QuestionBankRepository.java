package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Courses;
import com.lti.model.QuestionBank;

@Repository
public class QuestionBankRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(QuestionBank qb,Courses courses) {
		
		Courses c1=new Courses();
		String q1 ="select c from Courses c where cName=:cn";
		Query q=entityManager.createQuery(q1);
		q.setParameter("cn",courses);
		
		
		qb.setCourses(c1);
		entityManager.persist(qb);
	}

}
