package com.mindtree.customer.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customer.customer.exception.UserNotFoundException;
import com.mindtree.customer.customer.service.CustomerService;
import com.mindtree.customer.customer.user.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(path = "/customer")
	public List<Customer> getAllCustomer()
	{
		return service.getAllCustomer();
		
	}
	
	@GetMapping(path = "/customer/{id}")
	public Customer getEmployee(@PathVariable int id)
	{
		Customer customer = service.getCustomer(id);
		if(customer == null)
		{
			throw new UserNotFoundException("id -"+id);
		}
		return customer;
	}
	
	@PostMapping(path = "/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
	}

}
