package com.ineuron.ai.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ineuron.ai.sms.model.Student;
import com.ineuron.ai.sms.service.StudentService;



@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to list students and return model and view
	
	@GetMapping("/listStudents")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	
	@GetMapping("/listStudents/new")
	public String createStudentForm(Model model) {
		//create empty student object to student form data 
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	 }
	
	@PostMapping("/listStudents")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		
		
		return "redirect:/listStudents";
	}
	
}
