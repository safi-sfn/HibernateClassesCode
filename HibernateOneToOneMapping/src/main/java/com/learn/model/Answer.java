package com.learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private Integer id;
	private String answer;
	
	public Answer() {
		System.out.println("Constructor of Answer");
	}
	
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
