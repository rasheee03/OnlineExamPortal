package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.model.Option;
import com.lti.service.LevelService;

@Controller
public class LevelController {

	@Autowired
	private LevelService levelService;
	
	@RequestMapping(path="level1.lti", method=RequestMethod.POST)
	public String level(@RequestParam("id") String qid, @RequestParam("id1") String userop)
	{	
		List<Option> op1 = levelService.fetchOptionsForGivenQu(Integer.parseInt(qid),Integer.parseInt(userop));
		
		
		int counter;
		for(Option o :op1)
		{
			int a = o.getOpid();
			if(Integer.parseInt(userop) == a)
			{
				counter=+1;
			}
		}
		
		return "displayPaper.jsp";
		
		
	}
}
