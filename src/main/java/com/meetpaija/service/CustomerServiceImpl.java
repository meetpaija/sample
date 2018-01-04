package com.meetpaija.service;

import java.util.List;

import com.meetpaija.model.Customer;
import com.meetpaija.repo.CustomerRepo;
import com.meetpaija.repo.HibernateCustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	

	private CustomerRepo custRepo=new HibernateCustomerRepoImpl();
	
	public List<Customer> findAll()
	{
		return custRepo.findAll();
	}

}
