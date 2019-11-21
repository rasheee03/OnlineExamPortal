package com.lti.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Courses;
import com.lti.model.Options;
import com.lti.model.QuestionBank;
import com.lti.repository.QuestionBankRepository;

public class TestCases {

	@Test
	public void addQuestion() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		QuestionBankRepository repo = ctx.getBean(QuestionBankRepository.class);
		
		Courses c =  repo.fetchCourse(1);	
	
		QuestionBank q = new QuestionBank();
		q.setCourses(c);
		q.setQuestion("What is a class?");
		
		Options o1 = new Options();
		o1.setDescription("class is an instance of a object");
		o1.setIsCorrectAnswer('N');
		o1.setQuestionBank(q);

		Options o2 = new Options();
		o2.setDescription("class is a prototype for an object");
		o2.setIsCorrectAnswer('Y');
		o2.setQuestionBank(q);

		Options o3 = new Options();
		o3.setDescription("class is a primitive type");
		o3.setIsCorrectAnswer('N');
		o3.setQuestionBank(q);

		List<Options> options = new ArrayList<Options>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		q.setOptions(options);
		
		
		repo.add(q);
	}
}
