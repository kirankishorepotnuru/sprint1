package com.cg.fds.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.entities.Restaurant;


public interface IOrderRepository extends CrudRepository<OrderDetails, Integer>,CustomOrderRepository{
	

}
