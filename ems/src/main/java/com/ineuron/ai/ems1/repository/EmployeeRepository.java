package com.ineuron.ai.ems1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ineuron.ai.ems1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
