package com.ineuron.ai.ems1.service;

import java.util.List;

import com.ineuron.ai.ems1.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long EmployeeId);

	List<EmployeeDto> getAllEMployees();

	// this employeeDto basically contains the updated details which we are going
	// to update in the given id
	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
	
	void deleteEmployee(Long employeeId);

}
