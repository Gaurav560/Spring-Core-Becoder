package com.ineuron.ai.autoWire.xml;

import lombok.Data;

@Data
public class Student {

	public Student(Address address) {
		super();
		this.address = address;
	}

	private Address address;






	
}
