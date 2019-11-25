package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Option;

@Repository
public class OptionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void add(Option o)

	{
		System.out.println("hello Option"+ o.getQuestion().getQid());
		entityManager.persist(o);
	}
}
