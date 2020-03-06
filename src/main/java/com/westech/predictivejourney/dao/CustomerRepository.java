package com.westech.predictivejourney.dao;

import com.westech.predictivejourney.model.customer.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

}
