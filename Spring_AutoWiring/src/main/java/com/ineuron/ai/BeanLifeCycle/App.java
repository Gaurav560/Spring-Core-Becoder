package com.ineuron.ai.BeanLifeCycle;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ineuron/ai/BeanLifeCycle/config.xml");
	Employee employe	=context.getBean("employee",Employee.class);
//by default the scope of spring bean is singleton 
	//means pooore application mein us class ka jitna bhi baar object maangoge spring ioc container se wo ,
	//same object dega.naya object nahi banayega
		System.out.println(employe.hashCode());
		Employee e2=context.getBean("employee",Employee.class);
		
		System.out.println(e2.hashCode());
	}

}
