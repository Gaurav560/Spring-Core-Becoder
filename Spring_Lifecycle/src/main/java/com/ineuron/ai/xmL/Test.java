package com.ineuron.ai.xmL;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/xmL/config.xml");
		
		context.registerShutdownHook();
		Student student=context.getBean("st",Student.class);
		System.out.println(student);

	}

}
