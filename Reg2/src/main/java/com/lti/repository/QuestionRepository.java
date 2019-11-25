package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Question;

@Repository
public class QuestionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	

	@Transactional
	public void add(Question qb) {
		
		entityManager.persist(qb);
	}
	
	
	
	 public List<Question> findByLevel(int level) {
	        String q1 = "select q from Question q where q.level=:level";
	        Query q = entityManager.createQuery(q1);
	        q.setParameter("level", level);
	        return q.getResultList();

	 }


}
