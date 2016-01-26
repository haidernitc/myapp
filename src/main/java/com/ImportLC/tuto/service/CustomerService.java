package com.ImportLC.tuto.service;

import java.util.List;
import com.ImportLC.tuto.model.Customer;

public interface CustomerService {
	public void add(Customer customer);

	public void update(Customer customer);

	public void delete(int CustomerId);

	public Customer getCustomer(int CustomerId);

	public List<?> getAllCustomer();
}
