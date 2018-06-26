package edu.fa.mock.dao;

import edu.fa.mock.model.Orders;

public interface OrderDao {
	
	boolean createOrder(Orders order);
	
	boolean paymented(Orders order);
	
}
