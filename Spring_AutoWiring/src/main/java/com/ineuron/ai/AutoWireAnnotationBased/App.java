package com.ineuron.ai.AutoWireAnnotationBased;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/AutoWireAnnotationBased/config.xml");
	Employee student	=context.getBean("st",Employee.class);

		System.out.println(student);
	}

}
