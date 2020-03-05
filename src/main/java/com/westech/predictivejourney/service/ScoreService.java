package com.westech.predictivejourney.service;

import com.westech.predictivejourney.model.customer.Customer;
import com.westech.predictivejourney.model.marketing.Score;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

	public Score calculateScore(Customer customer) {
		Score score = new Score();

		return score;
	}


}
