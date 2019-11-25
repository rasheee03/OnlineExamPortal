package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Course;
import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.service.QuestionService;

@Controller
public class QuestionController {

	
	@Autowired
	private QuestionService queService;
	
	 
	 @RequestMapping(path = "question.lti", method = RequestMethod.POST)
	 private String addQuestions(@RequestParam("question")String q,
			 @RequestParam("options[0].description") String op1,@RequestParam("options[1].description") String op2,
			 @RequestParam("options[2].description") String op3,@RequestParam("options[3].description") String op4,
			 @RequestParam("level") String lvl ,
			 @RequestParam("courses_id") String c ,@RequestParam("correct_ans")String a)
	 {	 
		 
		
		 
   	 queService.addQuest(q,op1,op2,op3,op4,lvl,c,a);

		 
		 return "AddQuestions.jsp";
	 }
}

