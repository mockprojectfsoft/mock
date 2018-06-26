package edu.fa.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.fa.mock.dao.impl.CustomerDao;
import edu.fa.mock.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping(value="/register")
	public String register(Model model) {
		customerDao.createCustomer(new Customer());
		return "home/cart";
	}
	
	@RequestMapping(value="home")
	public String showHome() {
		return "home/index";
	}
}
