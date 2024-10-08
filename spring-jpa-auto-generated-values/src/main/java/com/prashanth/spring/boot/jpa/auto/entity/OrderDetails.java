package com.prashanth.spring.boot.jpa.auto.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)//Auto generating the Id value  //we have to drop the table to change the startegy(just use create in application.prperties)
	//AUTO-->IDENTITY OR SEQUENCE
	//IDENTITY FOR SQL SERVER OR WE CAN USE AUTO
	//SEQUENCE FOR ORACLE,POSTGRESQL OR WE CAN USE AUTO
	private UUID orderId;//private int orderId;
	//we can use UUID OR STRING DATA TYPE FOR UUID TYPE
	
	private double amount;
	
	private String email;
	
	private int noOfProducts;
	
	
}
