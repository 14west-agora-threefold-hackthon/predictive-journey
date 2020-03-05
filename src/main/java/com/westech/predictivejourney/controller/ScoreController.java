package com.westech.predictivejourney.controller;

import com.westech.predictivejourney.model.marketing.PredictionSet;
import com.westech.predictivejourney.model.request.ScoreRequest;
import com.westech.predictivejourney.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

	@Autowired
	ScoreService scoreService;

	@PostMapping(path = "/score/all", consumes = "application/json", produces = "application/json")
	public @ResponseBody PredictionSet getAllScore(@RequestBody ScoreRequest request) {
		System.out.println(request.getEmailAddress());
		return scoreService.getAllScore(request);
	}

}
