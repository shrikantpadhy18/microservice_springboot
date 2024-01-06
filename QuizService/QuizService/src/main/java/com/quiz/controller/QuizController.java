package com.quiz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entitities.Quiz;
import com.quiz.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	//public QuizController(QuizService quizService) {
	//	this.quizService=quizService;
	//}
	
	@PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Quiz create(@RequestBody Quiz quiz) {
		System.out.print("cahle:"+quiz);
		Quiz q = quizService.add(quiz);
		return q;
	}
	
	//get all
	
	@GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Quiz> get(){
		return quizService.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getOne(@PathVariable("id") Long ID){
		return quizService.get(ID);
	}
}
