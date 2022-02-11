package com.cg.fds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	@Autowired
	IOrderService service;
	
	@PostMapping("/save")
	public boolean saveOrderDetails(@RequestBody OrderDetails order)
	{
		service.addOrder(order);
		return true;
	}
	
	@GetMapping("/orders")
    public List<OrderDetails> getAllOrders()
    {
		return service.viewAllOrders();
    }
	
	@GetMapping("/ordersList")
	public List<OrderDetails> getAllOrders(@RequestBody Customer customer)
	{
		return service.viewAllOrders(customer);
	}
	

	
	
	@GetMapping("/removeOrder")
	public boolean removeOrder(@RequestBody OrderDetails order)
	{
		service.removeOrder(order);
		return true;
	}
	
}
