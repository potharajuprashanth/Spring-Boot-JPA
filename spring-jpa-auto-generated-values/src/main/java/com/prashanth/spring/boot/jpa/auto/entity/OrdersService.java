package com.prashanth.spring.boot.jpa.auto.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdersService {

	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
	public void addOrder()
	{
		OrderDetails order1=new OrderDetails();
 
		order1.setEmail("rohit@gmail.com");
		order1.setAmount(6745.00);
		order1.setNoOfProducts(54);
		orderDetailsRepository.save(order1);
		System.out.println("Order Deatils are Inserted/Saved Successfully");
	}
	
}
