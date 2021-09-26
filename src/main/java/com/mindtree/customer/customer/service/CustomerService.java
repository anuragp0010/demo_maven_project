package com.mindtree.customer.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.mindtree.customer.customer.user.Customer;


@Repository
public class CustomerService /*implements CustomerServiceImpl*/ {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private static List<Customer> customers = new ArrayList<>();
	
//	private static int usersCount = 0;
	
	static
	{
		customers.add(new Customer(1,"Anurag","Kadma"));
		customers.add(new Customer(2,"Ankur","Adityapur"));
		customers.add(new Customer(3,"Neelesh","Bangalore"));
	}
	
	
	
//	@Transactional
//	public Customer save(Customer customer)
//	{
//		if(customer.getId() == 0)
//		{
//			customer.setId(usersCount);
//		}
//		customers.add(customer);
//		return customer;
//	}
//
//	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
//		return jdbcTemplate.query("SELECT * FROM customer_details.customer_table", new BeanPropertyRowMapper<Customer>(Customer.class));
	}
//
//	@Override
//	public Customer getCustomer(int id) {
//		for (Customer customer : customers) {
//			
//			if(customer.getId() == id)
//				return customer;
//		}
//		return null;
//		
//		return jdbcTemplate.queryForObject("SELECT * FROM customer_details.customer_table c WHERE c.id=?", new BeanPropertyRowMapper<Customer>(Customer.class), id);
//	}
//
//	@Override
//	public int addCustomer(Customer customer) {
//		if(customer.getId() == 0)
//		{
//			customer.setId(usersCount);
//		}
//		customers.add(customer);
//		return customer;
//		
//		return jdbcTemplate.update("INSERT INTO customer_details.customer_table(name, address) VALUES (?, ?)", new Object[] {customer.getName(), customer.getAddress()});
//	}
//
//	@Override
//	public int deleteCustomer(int id) {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.update("DELETE FROM customer_details.customer_table c WHERE c.id=?", id);
//		return null;
//	}
//
//	@Override
//	public int updateCustomer(Customer customer, int id) {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.update("UPDATE customer_details.customer_table c SET c.name = ?, c.address = ? WHERE c.id = ?", new Object[] {customer.getName(), customer.getAddress(), id});
//		return null;
//	}

	

}
