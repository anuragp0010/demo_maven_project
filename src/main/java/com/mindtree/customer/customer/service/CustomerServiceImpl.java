package com.mindtree.customer.customer.service;

import java.util.List;

import com.mindtree.customer.customer.user.Customer;

public interface CustomerServiceImpl {
	
	public List<Customer> getAllCustomer();
	
	public Customer getCustomer(int id);

	public int addCustomer(Customer customer);
	
	public int deleteCustomer(int id);
	
	public int updateCustomer(Customer customer,int id);

}
