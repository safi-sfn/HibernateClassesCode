package com.learner.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetail")
public class StudentInfo {
	
	@Id
	@Column(name="Id")
	@GeneratedValue(generator="my_seq",strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name="my_seq",sequenceName="my_ownSequence",initialValue=100,allocationSize=1)
	private Integer sId;
	
	@Column(name="Std_City")
	private String sCity;
	
	@Column(name="std_Name")
	private String sName;
	
	@Column(name="Gender")
	private String sGender;
	
	public StudentInfo() {
		System.out.println("constructor");
	}
	

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsGender() {
		return sGender;
	}

	public void setsGender(String sGender) {
		this.sGender = sGender;
	}

}
