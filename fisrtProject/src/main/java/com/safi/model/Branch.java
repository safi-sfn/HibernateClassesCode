package com.safi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Branch {
	
	@Id
	private Integer branch_id;
	private String branch_name;
	private Integer branch_capcity;
	
	public Branch() {
		System.out.println("==========--add brnach");
	}
	
	public Integer getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public Integer getBranch_capcity() {
		return branch_capcity;
	}
	public void setBranch_capcity(Integer branch_capcity) {
		this.branch_capcity = branch_capcity;
	}
	

}
