package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.ExamResult;
import com.lti.repository.ResultRepo;

@Service
public class ResultService {

	
	@Autowired
	public ResultRepo resultRepo;
	
	
	public List<ExamResult> viewresult(int cid)
	{
		System.out.println("success");
		return resultRepo.fetchResult(cid);
		
}
}