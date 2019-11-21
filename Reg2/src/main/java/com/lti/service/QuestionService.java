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
	
	@Transactional
		public void addQuest(String q1,String op,int lvl,Course c1,char a)
		{
		
		//Course c = questRepo.fetchCourse(q.getCourses().getCid());		
		Question q = new Question();
		q.setCourses(c1);
		q.setQuestion(q1);
		q.setLevel(lvl);
		
		Option o1 = new Option();
		List<Option> o=new ArrayList<Option>();
		
		for(Option i: o )
		{
			i.setDescription(op);
			i.setQuestionBank(q);
			i.setIsCorrectAnswer(a);

		}
		o.add(o1);
		q.setOptions(o);
	

		questRepo.add(q);
		
		
//			Course c = questRepo.fetchCourse(qb.getCourses().getCid());
//			qb.setCourses(c);
//			
//			for(Option op : qb.getOptions())
//				op.setQuestionBank(qb);
//			
//			questRepo.add(qb);
		}
		
		
}
