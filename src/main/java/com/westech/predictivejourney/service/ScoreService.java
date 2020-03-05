package com.westech.predictivejourney.service;

import com.westech.predictivejourney.model.marketing.PredictionSet;
import com.westech.predictivejourney.model.marketing.Score;
import com.westech.predictivejourney.model.request.ScoreRequest;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

	public PredictionSet getAllScore(ScoreRequest request) {
		PredictionSet predictionSet = new PredictionSet();
		predictionSet.setAffiliate("MMP");

		Score score = new Score();
		score.setAcquire(10);
		score.setConvert(9);
		score.setAdopt(7);
		score.setEngage(6);

		predictionSet.setScore(score);

		return predictionSet;
	}
}
