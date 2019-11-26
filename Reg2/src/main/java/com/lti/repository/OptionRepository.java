package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Option;
import com.lti.model.Question;

@Repository
public class OptionRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Option o)

	{
		entityManager.persist(o);
	}
	
	
	  public Option getByQuestion(Question qb) {
	        String selectQuery = "Select q1 from Option q1 where q1.question.qid=:c1 and q1.isCorrectAnswer=:c2";
	        Query q = entityManager.createQuery(selectQuery);
	        q.setParameter("c1", qb.getQid());
	        q.setParameter("c2", "true");
	        List<Option> ques = q.getResultList();
	        if (ques.isEmpty()) {
	            return null;
	        } else {
	            return ques.get(0);
	        }
}
}

