package com.cg.fds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IOrderRepository;

@Service
public class IOrderServiceImpl implements IOrderService{
	
	@Autowired
	IOrderRepository repository;

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		repository.save(order);
		return null;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails removeOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		repository.delete(order);
		return null;
	}

	

	/*@Override
	public List<OrderDetails> viewAllOrders(Restaurant resName) {
		// TODO Auto-generated method stub
		List<Restaurant> list=repository.viewAllOrders(resName);
		return list;
	}*/

	@Override
	public List<OrderDetails> viewAllOrders(Customer customer) {
		// TODO Auto-generated method stub
		
		List<OrderDetails> list=repository.viewAllOrders(customer);
		return list;
	}

	@Override
	public List<OrderDetails> viewAllOrders() {
		// TODO Auto-generated method stub
		List<OrderDetails> list=(List<OrderDetails>) repository.findAll();
		return list;
	}

}
