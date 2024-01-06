package com.question.questionService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.questionService.entities.Question;
import com.question.questionService.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/create")
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	
	// get all
	
	@GetMapping("/")
	public List<Question> getAll()
	{
		return questionService.get();
	}
	
	@GetMapping("/{questionId}")
	public Question getOne(@PathVariable("questionId") Long ID)
	{
		return questionService.getOne(ID);
	}
	
}
