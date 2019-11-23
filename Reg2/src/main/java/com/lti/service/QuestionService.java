package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Course;
import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questRepo;
	

		public void addQuest(String q,String op1,String op2,String op3,String op4,String lvl,String c,String a)
		{
		
			//create Course object
			//create Option object
			// create Question
		
		Course c1=new Course();
		c1.setCid(Integer.parseInt(c));
		
		Option op=new Option();
		
		Question q1 = new Question();
		
		List<Option> o=new ArrayList<Option>();
		op.setDescription(op1);
		op.setDescription(op2);
		op.setDescription(op3);
		op.setDescription(op4);
		op.setIsCorrectAnswer(a);
		op.setQuestion(q1);
		o.add(op);
		
		
		
		q1.setCourses(c1);
		q1.setLevel(Integer.parseInt(lvl));
		q1.setQuestion(q);
		q1.setOptions(o);
		
		
	
		questRepo.add(q1);
		
		}
		
		
}
