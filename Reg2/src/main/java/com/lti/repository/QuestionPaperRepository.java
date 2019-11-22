package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.model.Question;

@Repository
public class QuestionPaperRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Question> fetchQuestions(int c){
	String s1 ="select q from Question q where course=:c1";
	Query q1=entityManager.createQuery(s1);
	q1.setParameter("c1",c);
	
	return q1.getResultList();
	
	}

}
