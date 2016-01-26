package com.ImportLC.tuto.dao;

import java.util.List;

import com.ImportLC.tuto.model.Customer;

public interface CustomerDao {

	public void add(Customer customer);
	public void update(Customer customer);
	public void delete(int CustomerId);
	public Customer getCustomer(int CustomerId);
	public List<?> getAllCustomer();
}
