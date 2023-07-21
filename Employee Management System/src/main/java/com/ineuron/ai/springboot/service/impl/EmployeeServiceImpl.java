package com.ineuron.ai.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ineuron.ai.springboot.exception.ResouceNotFoundException;
import com.ineuron.ai.springboot.model.Employee;
import com.ineuron.ai.springboot.repository.EmployeeRepository;
import com.ineuron.ai.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	//nahi bhi @Autowired likhte  to chalta because agar agar spring bean ke paas ek hi constuctor hai ,then spring will
	//configure this dependency automatically.
	
	//@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}





	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}





	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRepository.findAll();
	}





	@Override
	public Employee getEmployeeById(Long id) {
		
//	Optional<Employee> employee= employeeRepository.findById(id);
//	if (employee.isPresent()) {
//		return employee.get();
//	} 
//	
//	else {
//		throw new ResouceNotFoundException("Employee","id",id);
//	}
		
		//or above code can be written through functional interface
		
		return employeeRepository.findById(id).orElseThrow(()->new ResouceNotFoundException("EMployee","id",id));
	}





	@Override
	public Employee updateEmployee(Employee employee, Long id) {
	 //first we need to check whether this given employee id exist in this database or not 
		
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(()->new ResouceNotFoundException("Employee","id",id));
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		//save existing employee to db
		employeeRepository.save(existingEmployee);
		return null;
	}





	@Override
	public void deleteEmployee(Long id) {
		//check whether the employee exist in db or not 
		employeeRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Employee", "id", id));
		employeeRepository.deleteById(id);

	}

}
