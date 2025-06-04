package com.safi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// if we write only Entity the the name of table is ClassName . by implicitly we can add Table() annotation
@Entity  
@Table(name="student_info")
public class Student {
	
	@Id  // this annotation define the Primary key
	@Column(name="SID")
	private Integer sid;
	
	@Column(name="SNAME")
	private String sname;

	@Column(name="SCITY")
	private String scity;
	
	private String phone;
	
	
	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public Student() {
		System.out.println(" *MANDATORY* to add zero param constructor for Hibernate - log console");
	}

	
	

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	

	
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}
	
}
