package com.example.demo.PO;

import javax.persistence.Entity;
import javax.persistence.*; 
@Entity 
public class user {
	@Id
	private Long id;
	
	private String userName;

	private String password;

	private String name;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}