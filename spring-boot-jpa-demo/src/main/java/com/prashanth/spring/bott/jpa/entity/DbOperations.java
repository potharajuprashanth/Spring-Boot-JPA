package com.prashanth.spring.bott.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prashanth.spring.bott.jpa.entity.users.UserDetailsRepository;

@Component
public class DbOperations {

	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	
	

	
	
	//insert the data into the OrderDetails

	public void addOrderInfo()
	{
		OrderDetails order1=new OrderDetails();//creating the entity object from the entity class
		order1.setOrderId(101);
		order1.setEmailId("prashanth@gmail.com");
		order1.setName("Virat");
		order1.setNoOfItems(10);
		order1.setAmount(999.00);
		order1.setCity("Hyd");
		order1.setGender("Male");
		
		orderDetailsRepository.save(order1);//we are passing the entity object 
		System.out.println("One record is saved to orderdetails success.....");
	}
	
	//Delete  Order Data
	public void deleteOrder()
	{
		
		orderDetailsRepository.deleteById(101);
		System.out.println("********One Record is Deleted from the Order Table**********");
	}
	
	
	
}
