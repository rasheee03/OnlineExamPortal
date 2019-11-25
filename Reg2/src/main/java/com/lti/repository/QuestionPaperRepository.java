package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Question;
import com.lti.model.QuestionPaper;

@Repository
public class QuestionPaperRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	  public List<Question> fetchQuestions(int c)
	  {
		  String selectQuery ="Select q1 from Question q1 where q1.courses.cid=:c1";
		  Query q = entityManager.createQuery(selectQuery);
		  q.setParameter("c1", c);
		  List<Question> ques = q.getResultList();
		  return ques;
	  }
	
	
	


}
