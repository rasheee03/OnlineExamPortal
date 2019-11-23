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

	public List<Question> fetchQuestions(int c){
		return quesPaperRepo.fetchQuestions(c);
	}
}
