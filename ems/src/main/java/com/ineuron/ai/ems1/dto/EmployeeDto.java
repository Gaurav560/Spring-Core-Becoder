package com.ineuron.ai.ems1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	// we build employee dto class to transfer the data between client and server
	// we build this dto as a response for rest api

	private Long id;
	private String firstName;
	private String lastName;
	private String email;

}
