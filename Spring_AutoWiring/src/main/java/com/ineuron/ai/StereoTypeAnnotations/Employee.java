package com.ineuron.ai.StereoTypeAnnotations;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("employee")
public class Employee {

	@Value("4")
	private int id;
	@Value("gghhgft")
	private String name;
	
	@Value("#{addr}")
	private List<String> address;
	
}
