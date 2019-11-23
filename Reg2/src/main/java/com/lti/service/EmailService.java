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

	
	
	public boolean setPass(String em,String uuid)
	{
		boolean b=emailRepo.checkUser(em,uuid);
		return b;
		
	}
	
	
	public void send(String to, String subject, String body) throws MessagingException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		helper = new MimeMessageHelper(message, true);// true means multipart message
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);// true means we can provide html tags in body
		javaMailSender.send(message);

	}

}
