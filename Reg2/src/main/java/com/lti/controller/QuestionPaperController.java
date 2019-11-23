package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.repository.QuestionPaperRepository;
import com.lti.service.QuestionPaperService;

@Controller
public class QuestionPaperController {

	@Autowired
	private QuestionPaperService quesPaperService;
	
	@Autowired
	private QuestionPaperRepository quesRepo;
	

	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") String id,Map m)
	 {
		List<Question> q1=quesRepo.fetchQuestions(Integer.parseInt(id)); 
		List<Option> o1=quesRepo.fetchOneQuestion(Integer.parseInt(id)); 
		

//		List<Option> o1=quesRepo.fetchOptions(Integer.parseInt(qid)); 
 

		m.put("questions", q1);
		m.put("options", o1);
		
//			Question q= new Question();
//
//				q.getCourses();
//				q.getLevel();
//				q.getOptions();
//				q.getQuestion();
//				model.addAttribute("q", q);
		
		return "displayPaper.jsp";
	 }
	 
	
}
	

