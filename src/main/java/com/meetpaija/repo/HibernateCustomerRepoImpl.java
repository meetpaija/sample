package com.meetpaija.repo;

import java.util.*;

import com.meetpaija.model.Customer;

public class HibernateCustomerRepoImpl implements CustomerRepo {

	/* (non-Javadoc)
	 * @see com.meetpaija.repo.CustomerRepo#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> custs = new ArrayList<Customer>();
		Customer cust = new Customer();
		cust.setFname("meet");
		cust.setLname("paija");
		custs.add(cust);
		return custs;
	}

}
