package com.lti.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Course;
import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.repository.QuestionRepository;

public class TestCases {

	@Test
	public void addQuestion() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		QuestionRepository repo = ctx.getBean(QuestionRepository.class);
		
		Course c =  repo.fetchCourse(1);	
	
		Question q = new Question();
		q.setCourses(c);
		q.setQuestion("What is a class?");
		
		Option o1 = new Option();
		o1.setDescription("class is an instance of a object");
		o1.setIsCorrectAnswer('N');
		o1.setQuestionBank(q);

		Option o2 = new Option();
		o2.setDescription("class is a prototype for an object");
		o2.setIsCorrectAnswer('Y');
		o2.setQuestionBank(q);

		Option o3 = new Option();
		o3.setDescription("class is a primitive type");
		o3.setIsCorrectAnswer('N');
		o3.setQuestionBank(q);

		List<Option> options = new ArrayList<Option>();
		options.add(o1);
		options.add(o2);
		options.add(o3);
		q.setOptions(options);
		
		
		repo.add(q);
	}
}
