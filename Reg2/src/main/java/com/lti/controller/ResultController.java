package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.ExamResult;
import com.lti.service.ResultService;

@Controller
public class ResultController {
	
	@Autowired
	public ResultService resultService;
	
	
	@RequestMapping(path="result.lti", method=RequestMethod.POST)
	public String Result(@RequestParam("cid") int cid,Map model){
				List<ExamResult> er=resultService.viewresult(cid);
				
				model.put("ExamResult", er);
		System.out.println("success");
		return "Result2.jsp";
	}

}
