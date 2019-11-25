package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Option;

@Repository
public class OptionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Option o)

	{
		entityManager.persist(o);
	}
}
