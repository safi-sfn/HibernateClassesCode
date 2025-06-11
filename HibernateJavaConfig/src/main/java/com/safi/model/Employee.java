package com.safi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	
	@Id
	private Integer eId;
	private String eName;
	private Integer eSallary;
	@Transient
	private String eCity;
	
	public Employee() {
		System.out.println("Employee Constructor");
	}
	
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteSallary() {
		return eSallary;
	}
	public void seteSallary(Integer eSallary) {
		this.eSallary = eSallary;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
}
