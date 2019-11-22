package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Question;
import com.lti.service.QuestionPaperService;

@Controller
public class QuestionPaperController {

	@Autowired
	private QuestionPaperService quesPaperService;
	

	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") int id, Model model)
	 {
		List<Question> q1=quesPaperService.fetchPaper(id); 
		
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
