package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Question;
import com.lti.repository.ExamHistoryRepository;
import com.lti.repository.QuestionPaperRepository;

@Service
public class ExamService {

	
	@Autowired
	private ExamHistoryRepository ehRepo;
	
	@Autowired
	private QuestionPaperRepository qpRepo;
	

	
}
