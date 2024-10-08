package com.prashanth.query.interview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DMLoperations {

	@Autowired
	InterviewRepository interviewRepository;
	
	//update the status where id=3
	
	public void updateUserStatus()
	{
          interviewRepository.updateUserStatusByUserId(3, "Rescheduled");
          //System.out.println(n+"  Records are succesfully updated........");
	}
	
	
	//################JPQL##################
	//JPQL
	public void loadAllUsersByJpql()
	{
		List<InterviewUsers> list=interviewRepository.loadAllUsersData();
		list.stream().forEach(System.out::println);
	}
	
	//JPQL where 
	public void loadUsersByPhoneNumberJpql(String phone)
	{
		List<InterviewUsers> dataByPhone=interviewRepository.loadUsersByJpqlPhoneNumber(phone);
		dataByPhone.stream().forEach(System.out::println);
	}
	
}
