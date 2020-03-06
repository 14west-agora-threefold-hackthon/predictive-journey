package com.westech.predictivejourney.controller;

import com.westech.predictivejourney.model.customer.Customer;
import com.westech.predictivejourney.model.marketing.Score;
import com.westech.predictivejourney.service.CustomerDataService;
import com.westech.predictivejourney.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

	@Autowired
	ScoreService scoreService;

	@Autowired
	CustomerDataService customerDataService;

	@GetMapping("/score/emailaddress/{emailAddress:.+}")
	public float getScoreByEmail(@PathVariable String emailAddress) {
		// Get mock customer
		Customer customer = customerDataService.getMockCustomerByEmail(emailAddress);

		//Customer customer = customerDataService.getCustomerByEmail(emailAddress);

		Score marketingScore = scoreService.calculateScore(customer);

		customer.setMarketingScore(marketingScore.getMarketingScore());
		customerDataService.updateCustomerMarketingScore(customer);
		return marketingScore.getMarketingScore();
	}

}