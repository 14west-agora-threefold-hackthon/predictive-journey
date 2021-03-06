package com.westech.predictivejourney.service;

import com.westech.predictivejourney.dao.CustomerRepository;
import com.westech.predictivejourney.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerDataService {

	@Autowired
	CustomerRepository repository;

	public Customer getCustomerByEmail(String emailAddress) {
		Optional<Customer> optionalCustomer = repository.findById(emailAddress);
		if (optionalCustomer.isPresent()) {
			return optionalCustomer.get();
		} else {
			Customer customer = new Customer();
			customer.setEmailAddress(emailAddress);
			repository.save(customer);
			return customer;
		}
	}

	public void updateCustomerMarketingScore(Customer customer) {
		repository.save(customer);
	}

}
