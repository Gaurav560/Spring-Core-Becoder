package com.ineuron.ai.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ineuron/ai/primitive/config.xml");
		Student student1 = context.getBean("st1", Student.class);
		Student student2 = context.getBean("st2", Student.class);
		System.out.println(student1);
		System.out.println(student2);
	}

}
