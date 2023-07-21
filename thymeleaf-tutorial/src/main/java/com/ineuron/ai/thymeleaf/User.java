package com.ineuron.ai.thymeleaf;

import lombok.Data;

@Data
public class User {
	
	
private String userName;
 private String email;
 private String role;
 
//all args constructor	
 public User(String userName, String email, String role) {
	 super();
	 this.userName = userName;
	 this.email = email;
	 this.role = role;
 }
}
