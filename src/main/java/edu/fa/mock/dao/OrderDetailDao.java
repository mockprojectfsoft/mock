package edu.fa.mock.dao;

import java.util.List;

import edu.fa.mock.model.OrderDetail;

public interface OrderDetailDao {
	
	OrderDetail createOrderDetail(OrderDetail orderDetail);
	
	List<OrderDetail> getDetailOfOrder(int orderId);
	
}
