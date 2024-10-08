package com.prashanth.spring.bott.jpa.entity.users;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDbOperations {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	//Inser data into user table

	public void addUserInfo()
	{
		List<UserDetails> allUsers=new ArrayList<UserDetails>();
		
		UserDetails user1=new UserDetails();
		user1.setUserId(1001);
		user1.setEmailId("virat@gmail.com");
		user1.setName("Kohli");
		user1.setNoOfItems(10);
		user1.setAmount(7889.00);
		user1.setCity("Mumbai");
		user1.setGender("Male");
		
		
		UserDetails user2=new UserDetails();
		user2.setUserId(1002);
		user2.setEmailId("anushka@gmail.com");
		user2.setName("Anushka");
		user2.setNoOfItems(30);
		user2.setAmount(9999.00);
		user2.setCity("Delhi");
		user2.setGender("Female");
		
		
		UserDetails user3=new UserDetails();
		user3.setUserId(1003);
		user3.setEmailId("rohit@gmail.com");
		user3.setName("Rohit");
		user3.setNoOfItems(35);
		user3.setAmount(109999.00);
		user3.setCity("Mumbai");
		user3.setGender("Male");
		
		
		
		userDetailsRepository.saveAll(List.of(user1,user2,user3));//List object we have to pass
		
		/*we can also use like this
		 * allUsers.add(user1); 
		 * allUsers.add(user2); 
		 * allUsers.add(user3);
		 */
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@user details are added /inserted/saved to teh table@@@@@@@@@@@@@@@@@");
	}
	
	//Delete the data from users
	
	public void clearDataOfUserDetails()
	{
		userDetailsRepository.deleteAll();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$all the user details are cleared/deleted$$$$$$$$$$$$$$");
	}
	
	//Load the data based on the user id

	public void getUserInfoById()
	{
		System.out.println("&&&&&&&&&&&&& Users By ID $$$$$$$$$$$$$$$$$$");
	Optional<UserDetails> userData=	userDetailsRepository.findById(1001);
		
	UserDetails  userInfo= userData.get();
		System.out.println(userInfo);
	}
	
	
	//Load all the users details
	
	public void getAllUserInfo()
	{
		System.out.println("############## all users Details################");
	List<UserDetails> allUsersInfo=	userDetailsRepository.findAll();
	allUsersInfo.stream().forEach(System.out::println);
	}
	//Get the user details based on the CITY i.e Non -primary key column
	//userdefined method
	
	public void getUserInfoByCity(String cityName)
	{
			List<UserDetails> usersByCity=userDetailsRepository.findByCity(cityName);
	usersByCity.stream().forEach(System.out::println);
	}
	

	//Get the user info based on CITY AND GENDER
	
	public void getUserInfoByCityAndGender(String cityName,String genderType)
	
	{
	
List<UserDetails> usersByCityAndGender=userDetailsRepository.findByCityAndGender(cityName, genderType);
usersByCityAndGender.stream().forEach(System.out::println);
		
	}
	
	//Get the user info based on CITY OR GENDER
	
		public void getUserInfoByCityOrGender(String cityName,String genderType)
		
		{
		
	List<UserDetails> usersByCityOrGender=userDetailsRepository.findByCityOrGender(cityName, genderType);
	usersByCityOrGender.stream().forEach(System.out::println);
			
		}
		
		// custom method delete the user data by Name
		
		public void deleteUserInfoByName(String name)
		{
			System.out.println(userDetailsRepository.getClass());// to check which implementation object is used for the interfaces
		//class:	jdk.proxy2.$Proxy101 dynamically implemented
			//using the Proxy Design pattern for the User-defined Repositories
			
			
			
			
			userDetailsRepository.deleteByName(name);
			System.out.println(name+"  deleted%%%%%%%%%%%%%%%%%%");
		}
		
		
	
}
