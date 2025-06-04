package com.sfn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	
	@Id
	private Integer eId;
	private String eName;
	private String eCity;
	@Transient  // it means eSallry column doesn't show in Employee table
	private Integer eSallry;
	
	public Employee(){
		
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public void seteSallry(Integer eSallry) {
		this.eSallry = eSallry;
	}
	
}
