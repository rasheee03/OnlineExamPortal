package com.lti.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Login;
import com.lti.model.Registration;
import com.lti.repository.RegistrationRepository;

public class LoginTest {

	@Test
	public void testRegistrationWithLogin() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationRepository regRepo = ctx.getBean(RegistrationRepository.class);
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
	       
      
		Login l=new Login();
		Registration r=new Registration();
		r.setName("rashi");
		r.setEmail("rashi@gmail.com");
		r.setPassword("sssss");
		r.setMobile(455221);
		r.setQualification("be");
		r.setYearOfCompletion(LocalDate.of(2015, 11, 15).format(formatter));
		r.setDateOfBirth(LocalDate.of(2015, 11, 15).format(formatter));
		r.setCity("kalyan");
		r.setState("maharastra");
		r.setCaptcha("jsgd");
		r.setRole("ROLE_USER");
		
		l.setEmail(r.getEmail());
		l.setPassword(r.getPassword());
		l.setRegistration(r);
		r.setLogin(l);
		
		
		
		regRepo.add(r);
		
	}

}
