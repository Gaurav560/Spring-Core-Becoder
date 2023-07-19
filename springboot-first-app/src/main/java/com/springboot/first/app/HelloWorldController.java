package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {

	//get http method
	@GetMapping("/hello")
	public String helloWorld() {return "HelloWorld";}
	
}
