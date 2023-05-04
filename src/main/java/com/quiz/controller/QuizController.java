package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Quiz;
import com.quiz.repository.QuizRepository;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizRepository quizRepository;

	@GetMapping("/")
	public List<Quiz> getAll() {
		return quizRepository.findAll();
	}

	@PostMapping("/")
	public Quiz create(@RequestBody Quiz quiz) {
		return quizRepository.save(quiz);
	}

}
