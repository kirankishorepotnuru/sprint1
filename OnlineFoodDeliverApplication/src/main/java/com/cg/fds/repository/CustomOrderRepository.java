package com.cg.fds.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.entities.Restaurant;

@Repository
public interface CustomOrderRepository {
	
	
	public List<OrderDetails> viewAllOrders();
	//public List<OrderDetails> viewAllOrders(Restaurant resName);
	public List<OrderDetails> viewAllOrders(Customer customer);

}
