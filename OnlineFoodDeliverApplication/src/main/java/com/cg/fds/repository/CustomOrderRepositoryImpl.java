package com.cg.fds.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.entities.Restaurant;

public class CustomOrderRepositoryImpl implements CustomOrderRepository {

	
	@Autowired
	EntityManager entityManager;
	
	
	@Override
	public List<OrderDetails> viewAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<OrderDetails> viewAllOrders(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
