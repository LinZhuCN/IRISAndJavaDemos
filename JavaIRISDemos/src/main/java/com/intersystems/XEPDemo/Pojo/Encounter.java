package com.intersystems.XEPDemo.Pojo;

import com.intersystems.SpringMyBatisIRISDemo.Pojo.Patient;

public class Encounter {
	
	private String entNumber;
	
	private String entType;
	
	private Patient patient;

	public String getEntNumber() {
		return entNumber;
	}

	public void setEntNumber(String entNumber) {
		this.entNumber = entNumber;
	}

	public String getEntType() {
		return entType;
	}

	public void setEntType(String entType) {
		this.entType = entType;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
