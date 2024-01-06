package com.quiz.entitities;

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
	
	private long questionId;
	private String question;
	private Long quizId;
	
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
