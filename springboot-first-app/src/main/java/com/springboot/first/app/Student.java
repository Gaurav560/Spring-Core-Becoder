package com.springboot.first.app;

import lombok.Data;

@Data
public class Student {


	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private String firstName;
	private String lastName;
	
}
