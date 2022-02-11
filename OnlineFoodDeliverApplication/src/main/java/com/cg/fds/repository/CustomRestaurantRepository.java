package com.cg.fds.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.fds.entities.Restaurant;

@Repository
public interface CustomRestaurantRepository {
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant viewRestaurant(String name);
	public List<Restaurant> viewAllRestaurants();
	public List<Restaurant> viewNearByRestaurant(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);
}
