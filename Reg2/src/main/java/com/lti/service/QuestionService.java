package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Courses;
import com.lti.model.Options;
import com.lti.model.QuestionBank;
import com.lti.repository.QuestionBankRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionBankRepository questRepo;
	
	@Transactional
		public void addQuest(QuestionBank qb)
		{
			Courses c = questRepo.fetchCourse(qb.getCourses().getCid());
			qb.setCourses(c);
			
			for(Options op : qb.getOptions())
				op.setQuestionBank(qb);
			
			questRepo.add(qb);
		}
		
		public void addOptions()
		{
			
		}
		 
		public void addCourse()
		{
			
		}
	
}
