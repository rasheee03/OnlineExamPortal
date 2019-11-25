package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Course;

@Repository
public class CourseRepository{
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Course c)
	{
		entityManager.persist(c);
	}

}
