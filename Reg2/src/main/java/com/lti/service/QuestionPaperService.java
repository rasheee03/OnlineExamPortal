package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Question;
import com.lti.repository.QuestionPaperRepository;

@Service
public class QuestionPaperService {

	@Autowired
	private QuestionPaperRepository quesPaperRepo; 
	
	public List<Question> fetchPaper(int c){
		List<Question> q1 = quesPaperRepo.fetchQuestions(c);
		return q1;
		
//		for(Question q : q1)
//		{
//			q.getCourses();
//			q.getLevel();
//			q.getOptions();
//			q.getQuestion();
//		}
		 
	}
}
