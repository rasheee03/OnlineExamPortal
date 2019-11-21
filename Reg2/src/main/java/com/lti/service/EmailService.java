package com.lti.service;

import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.lti.repository.EmailRepository;
@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepo;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void check(String em) throws MessagingException 
	{
	
		
		
			String np=emailRepo.chkEm(em);
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper;
			helper = new MimeMessageHelper(message, true);// true means multipart message
			helper.setSubject("new pw");
			helper.setTo(em);
			helper.setText(np, true);// true means we can provide html tags in body
			javaMailSender.send(message);
			
		}
		
	
}
