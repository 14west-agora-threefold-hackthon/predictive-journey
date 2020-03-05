package com.westech.predictivejourney.service;

import com.westech.predictivejourney.model.customer.Customer;
import com.westech.predictivejourney.model.marketing.Score;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

	public Score calculateScore(Customer customer) {
		Score score = new Score();

		if (StringUtils.isNotBlank(customer.getEmailAddress())) {
			score.increase(1);
		}
		if (customer.getMwListsCount() > 0) {
			score.increase(1);
		}
		if (customer.getBsLastPurchaseSince() < 180) {
			score.increase(1);
		}
		if (customer.getBsLifetimeVisits() > 10) {
			score.increase(1);
		}
		if (customer.getBsPredictiveRetention() > 5) {
			score.increase(1);
		}
		if (customer.getBsLifetimeRevenue() > 2000) {
			score.increase(1);
		}
		if (customer.getBsPredictivePurchaseIntent() > 5) {
			score.increase(1);
		}
		return score;
	}


}
