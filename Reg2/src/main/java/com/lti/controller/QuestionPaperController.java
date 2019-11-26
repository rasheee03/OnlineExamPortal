package com.lti.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Question;
import com.lti.repository.QuestionRepository;
import com.lti.service.QuestionPaperService;

@Controller
public class QuestionPaperController {

	static int index=0;
	static int qno=1;
	List<Question> q1;
	@Autowired
	private QuestionPaperService quesPaperService;
	
	@Autowired
	private QuestionRepository quesRepo;
	

	@Autowired
	private HttpSession session;
	


	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") String id,Map m,ModelMap model)
	 {
		q1=quesPaperService.fetchQuestions(Integer.parseInt(id));
		m.put("question", q1.get(0));
		//session.setAttribute("questions", q1);
		//m.put("questions", q1);
		model.addAttribute("index", index);
		model.addAttribute("qno", qno);
	    return "displayPaper.jsp";
	    
	 }
	 @RequestMapping(path = "qp1.lti", method = RequestMethod.POST)
	 public String questionPaper(Map m,ModelMap model)
	 {
		 int size=q1.size()-1;
		//List<Question> q1=quesPaperService.fetchQuestions(Integer.parseInt(id));
		m.put("question", q1.get(++index));
		qno++;
		model.addAttribute("qno",qno);
		//session.setAttribute("questions", q1);
		//m.put("questions", q1);
		model.addAttribute("size", size);
		model.addAttribute("index", index);

	
			return "displayPaper.jsp";
	 
		
	 }

	
	 
	
}
	

