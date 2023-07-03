package com.ineuron.ai.Ci;

import java.util.List;

public class Student {

	private String name;
	private int id;
	private String address;
	private List<String> course;
	private Certificate certificate;
	
	
	
	
	
	
	
	
	
	public Student(String name, int id, String address, List<String> course, Certificate certificate) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.course = course;
		this.certificate = certificate;
	}

	
	
	
	public Student(String name, int id) {
		System.out.println(
				"String, int");
		this.id = id;
		this.name = name;
		
	}

	public Student(String name, String address) {
		System.out.println("String,String");
		this.name = name;
		this.address = address;
	}

	public Student(int id, String name) {
		System.out.println(
				"int ,String");
		this.id = id;
		this.name = name;

	}




	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + ", course=" + course + ", certificate="
				+ certificate + "]";
	}

	
	
	

	
	
}
