package com.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Parents")
public class Parents {
	
	@Id
	
	private Integer parent_id;
	private Integer student_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String realtionship;
	
	public Parents() {
		System.out.println("zero param constructor");
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRealtionship(String realtionship) {
		this.realtionship = realtionship;
	}
	
	

}
