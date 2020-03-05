package com.westech.predictivejourney.dao;

import com.westech.predictivejourney.model.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface InternalDAO extends CrudRepository<Customer, String> {

}
