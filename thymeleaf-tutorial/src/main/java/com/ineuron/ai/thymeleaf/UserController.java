package com.ineuron.ai.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	//handler methods in controller class
	
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users=new ArrayList<>();
		users.add(new User("Ramesh", "ramesh@gmial.com", "ADMIN"));
		users.add(new User("gaurav", "gsh@gmial.com", "USER"));
		model.addAttribute("users", users);
		return "if-unless";
		
	}
	
	
	//switch case method handler
	@GetMapping("/switch")
	public String switchCase(Model model) {
		User user=new User("Ramesh", "ramesh@gmial.com", "ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
