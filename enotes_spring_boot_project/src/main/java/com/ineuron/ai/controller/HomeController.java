package com.ineuron.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//controller request receive karta hai jo bhi browser se send hota hai 
@Controller
public class HomeController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/add_notes")
	public String add_notes() {
		return "add_notes";
		
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
	return "register";	
	}
	
	@GetMapping("/view_notes")
	public String view_notes() {
		return "view_notes";
	}
	
	@GetMapping("/edit_notes")
	public String edit_notes() {
		return "edit_notes";
	}
}
