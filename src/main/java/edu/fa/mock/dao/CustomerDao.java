package edu.fa.mock.dao;

import edu.fa.mock.model.Customer;

public interface CustomerDao {
	
	void createCustome(Customer customer);
	
	Customer login(Customer customer);
	
}
