package com.quiz.service;

import java.util.List;

import com.quiz.entitities.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);
	
}
