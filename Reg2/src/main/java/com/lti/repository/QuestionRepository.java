package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Course;
import com.lti.model.Option;
import com.lti.model.Question;

@Repository
public class QuestionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	public void add(Question qb) {
		
	
		
		entityManager.persist(qb);
	}
	
	public Course fetchCourse(int courseId) {
		return entityManager.find(Course.class, courseId);
	}

}
