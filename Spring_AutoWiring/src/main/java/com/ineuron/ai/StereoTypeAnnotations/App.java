package com.ineuron.ai.StereoTypeAnnotations;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/StereoTypeAnnotations/config.xml");
	Employee employe	=context.getBean("employee",Employee.class);

		System.out.println(employe);
	}

}
