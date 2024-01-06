package com.question.questionService.services;

import java.util.List;

import com.question.questionService.entities.Question;

public interface QuestionService {
	
	Question create(Question question);
	List<Question> get();
	
	Question getOne(Long id);
	
}
