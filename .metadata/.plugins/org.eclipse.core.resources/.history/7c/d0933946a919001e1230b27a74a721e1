package com.ineuron.ai.Ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/Ci/config.xml");
		Student student=context.getBean("st1",Student.class);
		System.out.println(student);

	}

}
