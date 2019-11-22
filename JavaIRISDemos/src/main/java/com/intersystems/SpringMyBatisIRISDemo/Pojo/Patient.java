package com.intersystems.SpringMyBatisIRISDemo.Pojo;

import java.io.Serializable;

public class Patient implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private String Gender;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
}
