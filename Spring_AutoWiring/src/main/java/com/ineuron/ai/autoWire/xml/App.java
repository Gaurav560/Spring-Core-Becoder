package com.ineuron.ai.autoWire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/autoWire/xml/config.xml");
	Student student	=context.getBean("std",Student.class);

		System.out.println(student);
	}

}
