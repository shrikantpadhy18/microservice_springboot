package com.quiz.service;

import com.quiz.entitities.*;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081",value = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
	//
	
	@GetMapping("/question/{quizId}")
	Question getQuestionOfQuiz(@PathVariable("quizId") Long quizId );

}
