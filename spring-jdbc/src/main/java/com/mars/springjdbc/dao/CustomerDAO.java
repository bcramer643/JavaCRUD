package com.mars.springjdbc.dao;

import java.util.List;


import com.mars.springjdbc.model.Customer;


public interface CustomerDAO {
	
	Customer getCustomerById(int customer_Id);
	
	
	int deleteCustomer (int customer_id);
	
	boolean updateCustomer (Customer customer);
	
	boolean createCutomer (Customer customer);

	List<Customer> getAllCustomers();


}
