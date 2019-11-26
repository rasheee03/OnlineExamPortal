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
int sum=0;
	
	@Autowired
	private LevelService levelService;
	
	@RequestMapping(path="level.lti", method=RequestMethod.POST)
	public String level(@RequestParam("q1") String qid, @RequestParam("op1") String opid)
	{	
		
			List<Option> options = levelService.fetchOptionsForGivenQu(Integer.parseInt(qid));
			
			
			
			int counter=0;
			for(Option o :options)
			{
				int a = o.getOpid();
				if(Integer.parseInt(opid) == a)
				{
					counter=+2;
				}
				
			}
			sum=sum+counter;
			
			if(sum<6)
			{
			return "displayPaper.jsp";
			}
			else
			return "scoreCard.jsp";
	}
}
