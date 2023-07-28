package com.ineuron.ai.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ineuron.ai.sms.model.Student;
import com.ineuron.ai.sms.repository.StudentRepository;
import com.ineuron.ai.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		//findAll is an inbuilt method of jpa repo which returns a list 
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	

}
