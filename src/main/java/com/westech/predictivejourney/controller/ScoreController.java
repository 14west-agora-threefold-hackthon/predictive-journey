package com.westech.predictivejourney.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

	@GetMapping("/score/all")
	public String getAllScores() {
		return "Hello World";
	}
}
