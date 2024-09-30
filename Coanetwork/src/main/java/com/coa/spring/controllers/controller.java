package com.coa.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {
	
	
	
	@GetMapping("/home")
	public String firstMethod()
	{
		
		
		return "Coanetwork Hyderabad";
	}
	

}
