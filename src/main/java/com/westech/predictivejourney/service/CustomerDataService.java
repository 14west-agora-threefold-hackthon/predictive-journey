package com.westech.predictivejourney.service;

import com.westech.predictivejourney.model.customer.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataService {

	private final String AQUIRE_EMAIL = "aquire@14west.us";
	private final String CONVERT_EMAIL = "convert@14west.us";
	private final String ADOPT_EMAIL = "adopt@14west.us";
	private final String ENGAGE_EMAIL = "engage@14west.us";

	public Customer getDataPoints() {

		return new Customer();
	}

	/**
	 * Dummy endpoint to get a specific user
	 *
	 * @param emailAddress
	 * @return
	 */
	public Customer getCustomerByEmail(String emailAddress) {

		if (emailAddress.equalsIgnoreCase(AQUIRE_EMAIL)) {
			return createAquireCustomer(emailAddress);
		}

		if (emailAddress.equalsIgnoreCase(CONVERT_EMAIL)) {
			return createConvertCustomer(emailAddress);
		}

		if (emailAddress.equalsIgnoreCase(ADOPT_EMAIL)) {
			return createAdoptCustomer(emailAddress);
		}

		if (emailAddress.equalsIgnoreCase(ENGAGE_EMAIL)) {
			return createEngageCustomer(emailAddress);
		}

		return new Customer();
	}

	private Customer createAquireCustomer(String emailAddress) {
		Customer customer = new Customer();
		customer.setEmailAddress(emailAddress);
		customer.setMwListsCount(0);
		return customer;
	}

	private Customer createConvertCustomer(String emailAddress) {
		Customer customer = new Customer();
		customer.setEmailAddress(emailAddress);
		customer.setMwListsCount(5);
		customer.setMwSubsCount(2);
		return customer;
	}

	private Customer createAdoptCustomer(String emailAddress) {
		Customer customer = new Customer();
		customer.setEmailAddress(emailAddress);
		customer.setMwListsCount(5);
		customer.setMwSubsCount(2);
		customer.setBsLastPurchaseSince(1);
		customer.setBsLifetimeVisits(100);
		customer.setBsLifetimeRevenue(9999);
		customer.setBsPredictivePurchaseIntent(0);
		return customer;
	}

	private Customer createEngageCustomer(String emailAddress) {
		Customer customer = new Customer();
		customer.setEmailAddress(emailAddress);
		customer.setMwListsCount(5);
		customer.setMwSubsCount(2);
		customer.setBsLastPurchaseSince(1);
		customer.setBsLifetimeVisits(100);
		customer.setBsLifetimeRevenue(9999);
		customer.setBsPredictivePurchaseIntent(100);
		return customer;
	}

}