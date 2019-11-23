package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.ExamHistory;
import com.lti.service.ExamHistoryService;

@Controller
public class ExamHistoryController {
	
	@Autowired 
	ExamHistoryService ehService;
	

	 @RequestMapping(path = "eh.lti", method = RequestMethod.POST)
	 public String examHistory(@RequestParam("id") String id ,Map m)
	 {
		 List<ExamHistory> eh= ehService.getDetails(Integer.parseInt(id));
		 m.put("details", eh);
		 
		 return "ExamHistory.jsp";
		 
	 }
	 
	

}
