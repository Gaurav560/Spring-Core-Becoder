package com.ineuron.ai.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/ref/config.xml");
	Student student=context.getBean("st1",Student.class);

	System.out.println(student.getAddress().getCity());
	System.out.println(student.getName());
	}

}
