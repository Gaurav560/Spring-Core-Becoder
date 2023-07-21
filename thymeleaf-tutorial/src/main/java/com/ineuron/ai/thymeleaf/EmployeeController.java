package com.ineuron.ai.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController{
	
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("gaurav","sharma","1809157@sbsstc.ac.in"));
		employees.add(new Employee("amar","sharma","1809157@sbsstc.ac.in"));
		employees.add(new Employee("gv","sharma","1809157@sbsstc.ac.in"));
		model.addAttribute("employees", employees);
		return "iteration";
		
	}

}
