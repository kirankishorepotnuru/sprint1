package com.cg.fds.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class OrderDetails {
	
    @Id
    @SequenceGenerator(name="order",initialValue=1001,allocationSize = 1)
    @GeneratedValue(strategy =GenerationType.AUTO,generator = "order")
	private int orderId;
	private LocalDateTime orderDate;
	@Embedded
	private Customer customer;
	
	private String orderStatus;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="order_restaurant_info",
			joinColumns=@JoinColumn(name="OrderId"),
			inverseJoinColumns=@JoinColumn(name="RestaurantId"))		
			
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(int orderId, LocalDateTime orderDate, Customer customer, String orderStatus) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customer = customer;
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", customer=" + customer
				+ ", orderStatus=" + orderStatus + "]";
	}
	
	
	

}
