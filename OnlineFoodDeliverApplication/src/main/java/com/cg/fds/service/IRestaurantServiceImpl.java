package com.cg.fds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IRestaurantRepository;

@Service
public class IRestaurantServiceImpl implements IRestaurantService{
	
	@Autowired
	IRestaurantRepository repository;
	@Override
	public Restaurant addRestaurant(Restaurant res) {
		repository.save(res);
		return null;
	}

	@Override
	public Restaurant removeRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		repository.delete(res);
		return null;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant viewRestaurant(String name) {
		return repository.viewRestaurant(name);
	}

	@Override
	public List<Restaurant> viewAllRestaurants() {
		List<Restaurant> list = (List<Restaurant>) repository.findAll();
		return list;
	}

	@Override
	public List<Restaurant> viewNearByRestaurant(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> viewRestaurantByItemName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
