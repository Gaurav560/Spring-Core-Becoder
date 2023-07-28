package com.ineuron.ai.ems1.mapper;

import com.ineuron.ai.ems1.dto.EmployeeDto;
import com.ineuron.ai.ems1.entity.Employee;

public class EmployeeMapper {

	//this method will map employee jpa entity to employee dto
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getId()	,employee.getFirstName(),employee.getLastName(), employee.getEmail());
		
	}
	
	//this method will map employee dto to employee jpa entity
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
		
	}
	
}
