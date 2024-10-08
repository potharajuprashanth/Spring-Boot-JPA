package com.prashanth.spring.bott.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanth.spring.bott.jpa.entity.users.UserDbOperations;
import com.prashanth.spring.bott.jpa.entity.users.UserUpdateOperation;
import com.prashanth.spring.bott.jpa.remaining.movies.MoviesDbOperations;

@SpringBootApplication
public class SpringBootJpaDemoApplication {

	public static void main(String[] args) { 
	ConfigurableApplicationContext container=	SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	
	
		System.out.println("#######Connection Established Successfully With Java Application to Postgresql DB#############");
	//System.out.println("=============Order DETAILS=========");
//DbOperations do1=container.getBean(DbOperations.class);
//		do1.addOrderInfo();
//do1.deleteOrder();
	
	
	//System.out.println("====================User Details=======================");
	//UserDbOperations ud1=container.getBean(UserDbOperations.class);
	
	
	
	//ud1.addUserInfo();
	//ud1.clearDataOfUserDetails();
	//ud1.getUserInfoById();
	//ud1.getAllUserInfo();
    //ud1.getUserInfoByCity("Mumbai");
	//ud1.getUserInfoByCityAndGender("Delhi", "Female");
	//ud1.getUserInfoByCityOrGender("Delhi", "Male");
	//ud1.deleteUserInfoByName("Rohit");
	
		System.out.println("######################Movies Details#########################");
		MoviesDbOperations md=container.getBean(MoviesDbOperations.class);
		//md.getMoviesByTitle("The Matrix");
	//md.getMoviesByGenre("Crime");
//md.getMoviesByGenre("Action");
		//md.getCountOfMoviesByGenre("Action");
		//md.getFirst4MoviesByLanguage("English");
		//md.getMoviesByDirector("Christopher Nolan");
		//md.getMoviesInfoByReleaseYearBetween(2010, 2020);
		//md.getMoviesByLanguageIn();
	//	md.fetchMoviesByContainingIgnore("aCtioN");
		//md.fetchMoviesInfoByStartingWith('I');//case sensitive 
	//	md.fetchMoviesInfoByRatingGreaterThan(8.5);
	
	
		System.out.println("======== Update Operation=============================");
		
		UserUpdateOperation udo=container.getBean(UserUpdateOperation.class);
	udo.updateUserInfo();
	
	}
	
	
	
	
	
	
	

}
