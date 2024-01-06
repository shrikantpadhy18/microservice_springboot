package com.question.questionService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.questionService.entities.Question;

public interface QuestionRepository  extends JpaRepository<Question, Long>{
	
	
	
}
