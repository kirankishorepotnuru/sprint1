package com.cg.fds.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.fds.entities.Restaurant;

public class CustomRestaurantRepositoryImpl implements CustomRestaurantRepository{
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public Restaurant addRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant removeRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant updateRestaurant(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant viewRestaurant(String name) {
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Restaurant r where r.restaurantName=:name";
		
		Query<Restaurant> query = session.createQuery(queryString);
		query.setString("restaurantName", name);
		
		Restaurant  list = (Restaurant) query.getSingleResult();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Restaurant Name Records Not In The DB");
		}
	}

	@Override
	public List<Restaurant> viewAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
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
