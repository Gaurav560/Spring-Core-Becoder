package com.ineuron.ai.thymeleaf;

import lombok.Data;

@Data
public class Employee {

	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}
	private String firstName;
	private String LastName;
	private String email;

}
