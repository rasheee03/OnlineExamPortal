package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.ExamHistory;
import com.lti.repository.ExamHistoryRepository;

@Service
public class ExamHistoryService {
	
	@Autowired 
	private ExamHistoryRepository ehRepo;
	
	
	public List<ExamHistory> getDetails(int lid)
	{
		List<ExamHistory> eh = ehRepo.get(lid);
		return eh;
	}

}
