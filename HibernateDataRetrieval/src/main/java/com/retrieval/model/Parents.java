package com.retrieval.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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
		System.out.println(" parent constructor");
	}

	@Override
	public String toString() {
		return "Parents [parent_id=" + parent_id + ", student_id=" + student_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", phone=" + phone + ", realtionship="
				+ realtionship + "]";
	}
	
}
