package com.ineuron.ai.BeanLifeCycle;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@Scope("prototype")
public class Employee {

	@Value("4")
	private int id;
	@Value("gghhgft")
	private String name;

	@Value("#{addr}")
	private List<String> address;

}
