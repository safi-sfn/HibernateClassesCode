package com.learn.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Stu_for_course")
public class Students {
	
	@Id
	@Column(name="student_id")
	private Integer id;
	
	private String name;
	
	private String city;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Courses> courses;
	
	public Students() {
		System.out.println("Constructor of Students");
	}
	

	public Set<Courses> getCourses() {
		return courses;
	}


	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", courses=" + courses + "]";
	}

	


	
	
	
}
