package com.ineuron.ai.AutoWireAnnotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Student {

	//@Autowired
	//@Qualifier("address1")
	//property injection
	private Address address;

	
	
	
	public Address getAddress() {
		return address;
	}

	
	//construction injection using @Autowired
//	@Autowired
//	public Student(Address address) {
//	System.out.println("construction injection ");
//		this.address = address;
//	}

	
	//setter injection using @Autowired



	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}


	public void setAddress(Address address) {
		System.out.println("setter injection");
		this.address = address;
	}
	

}
