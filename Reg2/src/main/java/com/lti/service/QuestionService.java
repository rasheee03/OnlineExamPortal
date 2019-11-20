package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Courses;
import com.lti.model.QuestionBank;
import com.lti.repository.QuestionBankRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionBankRepository questRepo;
	
		public void addQuest(QuestionBank qb, Courses c)
		{
			questRepo.add(qb,c);
		}
		
		public void addOptions()
		{
			
		}
		 
		public void addCourse()
		{
			
		}
	
}
