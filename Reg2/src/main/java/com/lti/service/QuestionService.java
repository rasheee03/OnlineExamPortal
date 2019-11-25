package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Course;
import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.repository.OptionRepository;
import com.lti.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository quesRepo;
	
	@Autowired
	private OptionRepository optionRepo;
	
		public void addQuest(String q,String op1,String op2,String op3,String op4,String lvl,String c,String a)
		{
		
		
				Course c1 = new Course();
		        c1.setCid(Integer.parseInt(c));

		        Option op = new Option();

		        Question q1 = new Question();

		        List<Option> o = new ArrayList<Option>();
		        op.setDescription(op1);
		        op.setIsCorrectAnswer(Boolean.toString(a.equalsIgnoreCase("1")));
		        op.setQuestion(q1);
		        o.add(op);

		        Option opp1 = new Option();
		        opp1.setDescription(op2);
		        opp1.setIsCorrectAnswer(Boolean.toString(a.equalsIgnoreCase("2")));
		        opp1.setQuestion(q1);
		        opp1.setQuestion(q1);
		        o.add(opp1);

		        Option opp2 = new Option();
		        opp2.setDescription(op3);
		        opp2.setIsCorrectAnswer(Boolean.toString(a.equalsIgnoreCase("3")));
		        opp2.setQuestion(q1);
		        o.add(opp2);

		        Option opp3 = new Option();
		        opp3.setDescription(op4);
		        opp3.setIsCorrectAnswer(Boolean.toString(a.equalsIgnoreCase("4")));
		        opp3.setQuestion(q1);
		        o.add(opp3);

		        q1.setCourses(c1);
		        q1.setLevel(Integer.parseInt(lvl));
		        q1.setQuestion(q);
//		        q1.setOptions(o);

		        quesRepo.add(q1);

		        for (Option option : o) {
		            System.out.println("dlfdlf" + option.getDescription());
		            optionRepo.add(option);
		        }
		}
}
		
		

