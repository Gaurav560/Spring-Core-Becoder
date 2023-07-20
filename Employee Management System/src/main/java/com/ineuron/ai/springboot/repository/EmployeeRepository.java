package com.ineuron.ai.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ineuron.ai.springboot.model.Employee;

//jpa repo takes two parameters. 1st is entity name and 2nd is type of primary key


public interface EmployeeRepository extends JpaRepository<Employee,Long>

{
	

}
