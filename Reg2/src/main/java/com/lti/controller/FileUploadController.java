package com.lti.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {


	@RequestMapping(path = "fileupload.lti", method = RequestMethod.POST)
	public String register(@RequestParam("QuestionFile") MultipartFile file) {
		//code to copy the uploaded image into d:/uploads folder
		String path = "d:/uploads/";
		String finalpath = path + file.getOriginalFilename();
		try {
			file.transferTo(new File(finalpath));
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	
		return "adminhome.jsp";
	
}
	
}
