package com.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entitities.Quiz;

public interface QuizRepository  extends JpaRepository<Quiz,Long>{
	
}
