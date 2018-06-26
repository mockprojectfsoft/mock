package edu.fa.mock.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import edu.fa.mock.model.Customer;

@Component
public class CustomerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	SessionFactory sessionFactory;
	
	public void createCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
}
