package com.ineuron.ai.Ci;

public class Student {

	private String name;
	private int id;
	private String address;
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
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	

	
	
}
