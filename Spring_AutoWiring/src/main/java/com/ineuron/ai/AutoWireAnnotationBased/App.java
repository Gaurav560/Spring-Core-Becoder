package com.ineuron.ai.AutoWireAnnotationBased;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/AutoWireAnnotationBased/config.xml");
	Student student	=context.getBean("st",Student.class);

		System.out.println(student);
	}

}
