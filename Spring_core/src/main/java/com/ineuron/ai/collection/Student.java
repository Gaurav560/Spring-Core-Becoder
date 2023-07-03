package com.ineuron.ai.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	
	//list mein aap duplicate values ko store kar sakte ho but set mein duplicate values allowed nahi hai 
	private List<String> address;
	private Set<String> phoneNumber;
	private Map<String, String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", courses="
				+ courses + "]";
	}
	
	
}
