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
	

	

	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") String id,Map m)
	 {
		List<Question> q1=quesPaperService.fetchQuestions(Integer.parseInt(id)); 
	
		m.put("questions", q1);
	    return "displayPaper.jsp";
	 }
	 
	
}
	

