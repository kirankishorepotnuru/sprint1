package com.cg.fds.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.fds.entities.Restaurant;

@Repository
public interface IRestaurantRepository extends CrudRepository<Restaurant, Integer> ,CustomRestaurantRepository
{
	

	
 // findALL , Save, findById , delete 
	// +
	
	// methods from custom Restaurant repository
}

