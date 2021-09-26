package com.mindtree.customer.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.customer.customer.exception.UserNotFoundException;
import com.mindtree.customer.customer.service.CustomerService;
//import com.mindtree.customer.customer.service.CustomerServiceImpl;
import com.mindtree.customer.customer.user.Customer;

@RestController("/api/v1/")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping(path = "/test")
	public String showdata()
	{
		return "Welcome to the Customer SpringBoot App";
	}
	 
	@GetMapping(path = "/customers")
	public List<Customer> getAllCustomer()
	{
		return service.getAllCustomer();
		
	}
	
//	@GetMapping(path = "/customers/{id}")
//	public Customer getCustomer(@PathVariable int id)
//	{
//		Customer customer = service.getCustomer(id);
//		if(customer == null)
//		{
//			throw new UserNotFoundException("id -"+id);
//		}
//		return customer;
//	}
//	
//	@DeleteMapping("/customers/{id}")
//	public String deleteById(@PathVariable int id) {
//		return service.deleteCustomer(id)+" Customer(s) delete from the database";
//	}
//	
//	@PostMapping(path = "/customers")
//	public String addCustomer(@RequestBody Customer customer)
//	{
//		return service.addCustomer(customer)+" Customer(s) saved successfully";
//	}
//	
//	@PutMapping("/customers/{id}")
//	public String update(@RequestBody Customer customer, @PathVariable int id) {
//		return service.updateCustomer(customer, id)+" Customer(s) updated successfully";
//	}

}
