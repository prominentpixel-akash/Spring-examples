package com.prominentpixel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/login")
	public String userValidate()
	{
		return "User: Successfully login in";
	}	
}