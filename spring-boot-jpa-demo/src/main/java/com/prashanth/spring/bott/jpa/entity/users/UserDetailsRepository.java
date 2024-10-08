package com.prashanth.spring.bott.jpa.entity.users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.transaction.Transactional;

@Transactional

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{

	 List<UserDetails> findByCity(String cityName);
	 List<UserDetails> findByCityAndGender(String cityName,String genderType);
	 List<UserDetails> findByCityOrGender(String cityName,String genderType);
	    void deleteByName(String name);// we have to add the @Transactional annotation
	    //void removeByName(String name); we can use remove instead of delete
	 
}
