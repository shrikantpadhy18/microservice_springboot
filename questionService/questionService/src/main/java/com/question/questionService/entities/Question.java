package com.question.questionService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long questionId;
	private String question;
	
	public String getQuestion() {
		return question;
	}
	
	public long getQuestionId() {
		return questionId;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	
}
