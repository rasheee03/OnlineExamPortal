package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Question;
import com.lti.repository.QuestionRepository;
import com.lti.service.QuestionPaperService;
import com.lti.service.QuestionService;

@Controller
public class QuestionPaperController {

	@Autowired
	private QuestionPaperService quesPaperService;
	
	@Autowired
	private QuestionRepository quesRepo;
	

	@Autowired
	private HttpSession session;
	


	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") String id,Map m)
	 {
		List<Question> q1=quesPaperService.fetchQuestions(Integer.parseInt(id)); 
	
		m.put("questions", q1);
	    return "displayPaper.jsp";
	 }
	 
	
	 
	
}
	

