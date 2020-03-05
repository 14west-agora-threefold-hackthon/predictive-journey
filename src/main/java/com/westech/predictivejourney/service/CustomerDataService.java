package com.westech.predictivejourney.service;

import com.westech.predictivejourney.model.customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataService {

	public Customer getDataPoints() {

		return new Customer();
	}

}
