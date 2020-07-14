package com.prominentpixel;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/getDate")
	public String date() {
		return "Current Date :: " + new Date();
	}
}
