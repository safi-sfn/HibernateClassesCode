package com.learn.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerTable {
	
	@Id
	@Column(name="answer_id")
	private Integer id;
	private String answer;
	@ManyToOne(cascade=CascadeType.ALL)
	private QuestionTable question;
	
	public AnswerTable() {
		System.out.println("Constructor of AnswerTable");
	}
	
	
	
	public QuestionTable getQuestion() {
		return question;
	}



	public void setQuestion(QuestionTable question) {
		this.question = question;
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



	@Override
	public String toString() {
		return "AnswerTable [id=" + id + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
}
