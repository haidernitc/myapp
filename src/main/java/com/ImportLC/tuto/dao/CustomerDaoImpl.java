package com.ImportLC.tuto.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ImportLC.tuto.model.Customer;
/**
 * Repository implementation
 * @author Haider
 *
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Customer customer) {
		session.getCurrentSession().save(customer);

	}

	@Override
	public void update(Customer customer) {
		session.getCurrentSession().update(customer);
	}

	@Override
	public void delete(int CustomerId) {
		session.getCurrentSession().delete(getCustomer(CustomerId));
	}

	@Override
	public Customer getCustomer(int CustomerId) {
		return (Customer) session.getCurrentSession().get(Customer.class, CustomerId);
	}

	@Override
	public List<?> getAllCustomer() {
		return session.getCurrentSession().createQuery("from Customer").list();
	}

}
