package com.ineuron.ai.springboot.service;

import java.util.List;

import com.ineuron.ai.springboot.model.Employee;

public interface EmployeeService {
	//a method which takes employee object and saves it into db 
public Employee saveEmployee(Employee employee);
//method to get all employees
List<Employee> getAllEmployee();
Employee getEmployeeById(Long id);
}
