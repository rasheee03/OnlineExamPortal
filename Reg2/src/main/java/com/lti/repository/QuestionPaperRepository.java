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
public class QuestionPaperRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	public List<Question> fetchQuestions(int c){
//	String s1 ="select q from Question q where course=:c1";
//	Query q1=entityManager.createQuery(s1);
//	q1.setParameter("c1",c);
//	
//	return q1.getResultList();
//	
//	}
//	
	
	 @Transactional
	  public List<Question> fetchQuestions(int c)
	  {
		  String selectQuery ="Select q1 from Question q1 where q1.courses.cid=:c1";
		  Query q = entityManager.createQuery(selectQuery);
		  q.setParameter("c1", c);
		  List<Question> ques = q.getResultList();
		  return ques;
	  }
	 
//	 public List<Option> fetchOptions(int q)
//	 {
//		 String selectQuery ="Select o1 from option o1 where o1.question.qid=:q1";
//		  Query o = entityManager.createQuery(selectQuery);
//		  o.setParameter("q1", q);
//		  List<Option> ops = o.getResultList();
//		  return ops;
//		 
//	 }

}
