package com.ineuron.ai.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ineuron.ai.sms.model.Student;
import com.ineuron.ai.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
	
		Student std1=new Student("Gaurav ", "Sharma", "1809157@sbsstc.ac.in");
		Student std2=new Student("Gau ", "Sha", "180917@sbsstc.ac.in");
		Student std3=new Student("G ", "a", "17@sbsstc.ac.in");
		studentRepository.save(std1);
		studentRepository.save(std2);
		studentRepository.save(std3);
	}

}
