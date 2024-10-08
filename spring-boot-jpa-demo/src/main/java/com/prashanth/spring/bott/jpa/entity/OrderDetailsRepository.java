package com.prashanth.spring.bott.jpa.entity;

import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer>
//T-entity class name-->OrderDetails
//ID--data type of the @Id property i.e ------>Integer

{

	
	
}
