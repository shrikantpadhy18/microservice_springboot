package com.quiz.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entitities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	
	@Autowired
	private QuizRepository quizRepository;
	@Autowired
	private QuestionClient questionClient;
	
	//public QuizServiceImpl(QuizRepository quizRepository)
	//{
	//	this.quizRepository = quizRepository;
	//}
	
	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		quizRepository.save(quiz);
		return quiz;
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		
		List<Quiz> quizzes =  quizRepository.findAll();
		List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
			quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
		return newQuizList;
	}

	@Override
	public Quiz get(Long id) {
		// TODO Auto-generated method stub
		Quiz quiz =  quizRepository.findById(id).orElseThrow(()-> new RuntimeException("quiz not found"));
		quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
		return quiz;
	}
	
}
