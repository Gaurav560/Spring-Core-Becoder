package com.ineuron.ai.Spel;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/Spel/config.xml");
Student student=context.getBean("student",Student.class);
//by default the scope of spring bean is singleton 
	//means pooore application mein us class ka jitna bhi baar object maangoge spring ioc container se wo ,
	//same object dega.naya object nahi banayega
	
	System.out.println(student);
	}

}
