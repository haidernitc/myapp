package com.ImportLC.tuto.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ImportLC.tuto.model.Customer;
import com.ImportLC.tuto.service.CustomerService;

/**
 * Customer controller
 * 
 * @author Haider
 * 
 */
@Controller
public class CustomerController {
	@Autowired
	private CustomerService CustomerService;

	/**
	 * This method redirect us to the main page defined in index.html in html
	 * folder this page contains the main menu of the app, wish allows us to
	 * switch between JSP and angular CRUD Technics
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String indexStart() {
		return "redirect:/html/index.html";
	}

	/**
	 * Form initialisation associated to Customer.html when URL is loaded for the
	 * first time
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/Customer")
	public String setupForm(Map<String, Object> map) {
		Customer customer = new Customer();
		map.put("Customer", customer);
		map.put("CustomerList", CustomerService.getAllCustomer());
		return "employe";
	}

	/**
	 * This controller method insert the passed Customer in the database
	 * 
	 * @param Customer
	 * @return Customer json list
	 */
	@RequestMapping(value = "/insert.Customer", method = RequestMethod.POST)
	public @ResponseBody List<Customer> insertCustomer(
			@ModelAttribute Customer customer) {
		CustomerService.add(customer);
		// We get employes list
		List<Customer> allCustomer = (List<Customer>) CustomerService
				.getAllCustomer();
		return allCustomer;
	}

	/**
	 * This controller method update the passed Customer in the database
	 * 
	 * @param Customer
	 * @return
	 */
	@RequestMapping(value = "/update.Customer", method = RequestMethod.POST)
	public @ResponseBody List<Customer> updateCustomer(
			@ModelAttribute Customer customer) {
		CustomerService.update(customer);
		// We get employes list
		List<Customer> allCustomer = (List<Customer>) CustomerService
				.getAllCustomer();
		return allCustomer;
	}

	/**
	 * This controller method delete the passed employe by id in the database
	 * 
	 * @param employeId
	 * @return Employes json list
	 */
	@RequestMapping(value = "/delete.Customer", method = RequestMethod.GET)
	public @ResponseBody List<Customer> deleteCustomer(@RequestParam int CustomerId) {
		CustomerService.delete(CustomerId);
		// We get Customer list
		List<Customer> allCustomer = (List<Customer>) CustomerService
				.getAllCustomer();
		return allCustomer;
	}

	/**
	 * URL call that allows us to list employes in a table associated with
	 * angular directive
	 * 
	 * @return Customer json list
	 */
	@RequestMapping(value = "/list.Customer", method = RequestMethod.GET)
	public @ResponseBody List<Customer> listCustomer() {
		// We get Customer list
		List<Customer> allCustomer = (List<Customer>) CustomerService
				.getAllCustomer();
		return allCustomer;
	}

	/**
	 * This controller method RETURN the passed employe by id in the database
	 * 
	 * @param employeId
	 * @return Employes json list
	 */
	@RequestMapping(value = "/get.Customer", method = RequestMethod.GET)
	public @ResponseBody Customer getCustomer(@RequestParam int CustomerId) {
		return CustomerService.getCustomer(CustomerId);
	}

	/**
	 * 
	 * @param employe
	 * @param result
	 * @param action
	 * @param map
	 * @return employe jsp page
	 */
	@RequestMapping(value = "/Customer.execute", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Customer customer,
			BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Customer CustomerResult = new Customer();
		switch (action.toLowerCase()) {
		case "add":
			CustomerService.add(customer);
			CustomerResult = customer;
			break;
		case "update":
			CustomerService.update(customer);
			CustomerResult = customer;
			break;
		case "delete":
			CustomerService.delete(customer.getCustomerId());
			CustomerResult = new Customer();
			break;
		case "find":
			Customer searchedCustomer = CustomerService.getCustomer(customer
					.getCustomerId());
			CustomerResult = searchedCustomer != null ? searchedCustomer
					: new Customer();
			break;
		}
		map.put("Customer", CustomerResult);
		map.put("employeList", CustomerService.getAllCustomer());
		return "employe";
	}

	public CustomerService getCustomerService() {
		return CustomerService;
	}

	public void setEmployeService(CustomerService customerService) {
		this.CustomerService = customerService;
	}

}
