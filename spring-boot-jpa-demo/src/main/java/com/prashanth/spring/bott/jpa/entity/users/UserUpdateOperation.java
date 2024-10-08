package com.prashanth.spring.bott.jpa.entity.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserUpdateOperation {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	//update the amount
	/*
	 * public void updateUserInfo() { UserDetails userDetails=new UserDetails();
	 * userDetails.setUserId(1001); userDetails.setAmount(1299999.00); // when we
	 * set userId and setAmount o/p:1001 null null 0 1299999.00 null null
	 * 
	 * userDetailsRepository.save(userDetails); }
	 */
	
	
	//to update amount 
	//load+save
	
	public void updateUserInfo()
	{
		UserDetails findUser=userDetailsRepository.findById(1001).get();//load
	
		findUser.setAmount(345678.00);
		
		userDetailsRepository.save(findUser);//save 
	}
}
