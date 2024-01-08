package com.quiz.entitities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	
	//@JsonProperty("questionId")
	private long questionId;
	//@JsonProperty("question")
	private String question;
	
	//@JsonIgnore
	public String getQuestion() {
		return question;
	}
	//@JsonIgnore
	public long getQuestionId() {
		return questionId;
	}
	//@JsonIgnore
	public void setQuestion(String question) {
		this.question = question;
	}
	
	//@JsonIgnore
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	
}
