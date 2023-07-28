package com.ineuron.ai.sms.service;

import java.util.List;

import com.ineuron.ai.sms.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
		Student saveStudent(Student student);
	
}
