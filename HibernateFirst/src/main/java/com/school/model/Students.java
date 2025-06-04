package com.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {

	@Id
	private Integer student_id;
	private String first_name;
	private String last_name;
	private String gender;
	private String address;
	private String email;
	private String phone;
	
	public Students() {
		System.out.println("====----====");
	}
	
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
