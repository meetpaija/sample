package com.meetpaija.repo;

import java.util.List;

import com.meetpaija.model.Customer;

public interface CustomerRepo {

	List<Customer> findAll();

}