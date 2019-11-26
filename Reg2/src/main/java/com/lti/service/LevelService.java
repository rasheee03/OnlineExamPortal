package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Option;
import com.lti.repository.LevelRepository;

@Service
public class LevelService {

	@Autowired
	private LevelRepository levelRepo;
	
	
public List<Option> fetchOptionsForGivenQu(int qid) {
		
		List<Option> options = levelRepo.fetchOptionsForGivenQu(qid);
		
		
		
		return options;
	}
}