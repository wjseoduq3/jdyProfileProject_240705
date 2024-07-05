package com.jdy.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	@GetMapping(value = "/")
	public String home() {		
		return "index";
	}
	
	@GetMapping(value = "/index")
	public String index() {		
		return "index";
	}
	
}
