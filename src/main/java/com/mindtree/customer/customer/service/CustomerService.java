package com.mindtree.customer.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.customer.customer.user.Customer;

@Service
public class CustomerService implements CustomerServiceImpl {
	
	private static List<Customer> customers = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static
	{
		customers.add(new Customer(1,"Anurag","Kadma"));
		customers.add(new Customer(2,"Ankur","Adityapur"));
		customers.add(new Customer(3,"Neelesh","Bangalore"));
	}
	
	@Transactional
	public Customer save(Customer customer)
	{
		if(customer.getId() == 0)
		{
			customer.setId(usersCount);
		}
		customers.add(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		for (Customer customer : customers) {
			
			if(customer.getId() == id)
				return customer;
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		if(customer.getId() == 0)
		{
			customer.setId(usersCount);
		}
		customers.add(customer);
		return customer;
	}

	

}
