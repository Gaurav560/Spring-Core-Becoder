package com.ineuron.ai.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("student")
public class Student {

	@Value("#{1+2}")
	private int sum;
	@Value("#{3-1}")
	private int diff;
	
	@Value("#{2*4}")
	private int mul;
	@Value("#{5/1}")
	private int div;
	
	@Value("#{1==2}")
	private boolean equalValid;
	
	@Value("#{4==2 && 2!=4}")
	private boolean checkStatus;
	
	@Value("#{4>2?'YES':'No'}")
	private String checkTernary;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int num;
	
	@Value("#{T(java.lang.Math).PI}")
	private int num1;
	
	
	public static String call() {
		return "user is calling";
		
	}
	
	@Value("#{T(com.ineuron.ai.Spel.Student).call()}")
	private String result;
}
