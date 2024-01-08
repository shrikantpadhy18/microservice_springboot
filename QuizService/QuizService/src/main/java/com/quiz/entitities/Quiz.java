package com.quiz.entitities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private long id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("questions")
	transient private Question questions;
	@JsonIgnore
	public String getTitle() {
		return title;
	}
	@JsonIgnore
	public void setTitle(String title) {
		this.title = title;
	}
	@JsonIgnore
	public Long getId() {
		return id;
	}
	@JsonIgnore
	public void setId(long id) {
		this.id = id;
	}
	@JsonIgnore
	public void setQuestions(Question qtns) {
		this.questions = qtns;
	}
}
