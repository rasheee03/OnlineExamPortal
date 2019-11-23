package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
	
	
//	=================================================================================
	 
//	 @Transactional
//	 public List<Option> fetchOneQuestion(int c2)
//	  {		
//		 String q="select q,o from Question q inner join Option o on q.qid=o.qid where q.courses.cid in "
//	  		+ " (select c from Course c where cid=:c1)";
//	  		entityManager.createQuery(q);
//	  		q.setParameter("c1",c2);
//	  			List<Question> ques = q.getResultList();
//			 
//	  
//	   	return op;
// }
//		 
//		
//		 
	  
	 
	 
//	 @Transactional
//	  public List<Question> fetchOneQuestion(int c)
//	  {
//		 @Query(value="Select question from Question q1 where q1.courses.cid=:c1 ORDER BY random()", nativeQuery=true)
//		  Query q = entityManager.createQuery(selectQuery);
//		  q.setParameter("c1", c);
//		  q.setMaxResults(1);
//		  List<Question> ques = q.getResultList();
//		 
//		  return ques;
//	  }
//	 
//	 @Query(value="select first_name, last_name from Users u where u.user_id =:userId", nativeQuery=true)
//	 List<Object[]> getUserFullNameById(@Param("userId") String userId);

	 
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
