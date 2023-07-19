package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student/")
	public Student getStudentObject() {
		return new Student("gaurav","sharma");
	}
}
