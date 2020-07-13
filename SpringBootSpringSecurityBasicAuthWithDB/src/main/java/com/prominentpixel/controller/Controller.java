package com.prominentpixel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {
	
	@RequestMapping("/login")
	public String userValidation() 
	{
		return "User: Successfully logged in!";
	}	
}