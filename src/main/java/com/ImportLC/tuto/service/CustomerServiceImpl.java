package com.ImportLC.tuto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ImportLC.tuto.dao.CustomerDao;
import com.ImportLC.tuto.model.Customer;

/**
 * 
 * @author Haider
 * 
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao dao;

	@Transactional
	@Override
	public void add(Customer customer) {
		dao.add(customer);
	}

	@Transactional
	@Override
	public void update(Customer customer) {
		dao.update(customer);
	}

	@Transactional
	@Override
	public void delete(int CustomerId) {
		dao.delete(CustomerId);
	}

	@Transactional
	@Override
	public Customer getCustomer(int CustomerId) {
		return dao.getCustomer(CustomerId);
	}

	@Transactional
	@Override
	public List<?> getAllCustomer() {
		return dao.getAllCustomer();
	}

	public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}

	

}
