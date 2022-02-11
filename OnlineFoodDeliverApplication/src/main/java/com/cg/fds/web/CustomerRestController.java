package com.cg.fds.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fds.repository.CustomRestaurantRepository;
import com.cg.fds.service.IRestaurantService;
import com.cg.fds.entities.Restaurant;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	IRestaurantService restservice;
	
	@PostMapping("/restaurant")
	public boolean saveBook(@RequestBody Restaurant r)
	{
		restservice.addRestaurant(r);
		return true;
	}
	
	@GetMapping("/restaurants")
	public List<Restaurant> getAllRestaurant()
	{
		return restservice.viewAllRestaurants();
	}
	
	@GetMapping("/viewrestaurant")
	public Restaurant viewRestaurant(@RequestParam String name)
	{
		return restservice.viewRestaurant(name);
	}
	
	@GetMapping("/removerestaurant")
	public boolean removeRestaurant(@RequestBody Restaurant r)
	{
		restservice.removeRestaurant(r);
		return true;
	}
	
	
	
	
	
	
	
	

}
