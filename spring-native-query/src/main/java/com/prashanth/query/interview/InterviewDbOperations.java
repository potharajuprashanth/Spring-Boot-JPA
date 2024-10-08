package com.prashanth.query.interview;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InterviewDbOperations {

	
	@Autowired
	InterviewRepository interviewRepository;


	//Native Query Load All  interview users info
	public void getAllUsersInfo( )
	{
		List<InterviewUsers> allUsers=interviewRepository.loadAllUsersInfo();
		allUsers.stream().forEach(System.out::println);
	}
	
	
	  public void getUserByNameAndStatus(String name,String status) {
	  List<InterviewUsers>
	  usersByNameStatus=interviewRepository.loadAllUsersByNameAndStatusInfo(name,
	  status); usersByNameStatus.stream().forEach(System.out::println); }
	 
	
	//load Data By DATE AND EMAIL
	public void getUsersByDateAndEmail(Date date,String email)
	{
		List<InterviewUsers> dataByDataAndEmail=interviewRepository.loadDataByDateAndEmail(date, email);
		dataByDataAndEmail.stream().forEach(System.out::println);
		
		
		
	}
}
