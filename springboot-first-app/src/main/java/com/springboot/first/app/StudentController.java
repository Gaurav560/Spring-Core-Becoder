package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student/")
	public Student getStudentObject() {
		return new Student("gaurav","sharma");
	}
	
	
	@GetMapping("/get-Students/")
	public List<Student> getStudentObjects(){
		
		List<Student> students=new ArrayList<>();
		students.add(new Student("amar","sharma"));
		students.add(new Student("sameer","sharma"));
		students.add(new Student("piyush","sharma"));
		students.add(new Student("puchu","sharma"));
		students.add(new Student("divya","sharma"));
		return students;
	}
	
	
	
	//creating rest api to handle pathVariable

	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName1,@PathVariable("lastName") String lastName1) {
		return new Student(	firstName1, lastName1);
	}
}
