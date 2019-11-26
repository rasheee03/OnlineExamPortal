package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Course;
import com.lti.model.ExamHistory;
import com.lti.model.Login;
import com.lti.model.Question;
import com.lti.model.QuestionPaper;
import com.lti.repository.CourseRepository;
import com.lti.repository.ExamHistoryRepository;
import com.lti.repository.LoginRepository;
import com.lti.repository.QuestionPaperRepository;
import com.lti.repository.QuestionRepository;

@Service
public class QuestionPaperService {

	@Autowired
	private QuestionPaperRepository quesPaperRepo; 
	

	
	@Transactional

	public List<Question> fetchQuestions(int c){
		return quesPaperRepo.fetchQuestions(c);
	}
	
	
	public void save(String ans)
	{
		quesPaperRepo.save(ans);
	}
}
