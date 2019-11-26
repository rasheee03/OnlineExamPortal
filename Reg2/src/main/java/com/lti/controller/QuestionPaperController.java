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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.model.Question;
import com.lti.repository.QuestionRepository;
import com.lti.service.QuestionPaperService;

@Controller
@SessionAttributes({"questions","index","qno"})
public class QuestionPaperController {

	@Autowired
	private QuestionPaperService quesPaperService;
	
	@Autowired
	private QuestionRepository quesRepo;
	
	 @RequestMapping(path = "qp.lti", method = RequestMethod.POST)
	 public String questionPaper(@RequestParam("id") String id,ModelMap model)
	 {
		List<Question> qs=quesPaperService.fetchQuestions(Integer.parseInt(id));
		
		model.put("questions", qs);
		model.put("question", qs.get(0));
		Integer index = 0;
		Integer qno = 0;
		
		model.addAttribute("qno", qno);
		model.addAttribute("size", qs.size());
	    
		return "displayPaper.jsp";
	    
	 }
	 @RequestMapping(path = "qp1.lti", method = RequestMethod.POST)
	 public String questionPaper(ModelMap model)
	 {  
		
		 List<Question> qs = (List<Question>) model.get("questions");
		 Integer qno = (Integer) model.get("qno");
		 int size=qs.size();
		 model.put("question", qs.get(++qno));
		 model.addAttribute("qno",qno);
		
		return "displayPaper.jsp";
	 
		
	 }

	
	 
	
}
	

