package com.prashanth.query.interview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class SortingAndPagination {

	@Autowired
	InterviewRepository interviewRepository;
	
	//Load the Data in ASC order
	//Soert by methods will take the entity property names not column name s of the table
	public void loadDataOrderByDateAsc()
	{
	//	List<InterviewUsers> allUsersDataBeforeSorting=interviewRepository.findAll();
	//	allUsersDataBeforeSorting.stream().forEach(System.out::println);
			List<InterviewUsers> allUsersDataAfterSorting=	interviewRepository.findAll(org.springframework.data.domain.Sort.by("interviewDate"));
			allUsersDataAfterSorting.stream().forEach(System.out::println);
	
	}
	
	//Load teh data in DESC ORDER
	public void loadDataOrderByDateDesc()
	{
	//	List<InterviewUsers> allUsersDataBeforeSorting=interviewRepository.findAll();
	//	allUsersDataBeforeSorting.stream().forEach(System.out::println);
			List<InterviewUsers> allUsersDataAfterSorting=	interviewRepository.findAll(Sort.by(Direction.DESC,"interviewDate"));
			allUsersDataAfterSorting.stream().forEach(System.out::println);
	
	}
	
	
	//Load teh data in ASC based on the email,name
		public void loadDataOrderByAscEmailName()
		{
		//	List<InterviewUsers> allUsersDataBeforeSorting=interviewRepository.findAll();
		//	allUsersDataBeforeSorting.stream().forEach(System.out::println);
				List<InterviewUsers> allUsersDataAfterSorting=	interviewRepository.findAll(Sort.by("name","email"));
				allUsersDataAfterSorting.stream().forEach(System.out::println);
		
		}
		
		
		

		//Load teh data in DESC based on the email,name
			public void loadDataOrderByDESCEmailName()
			{
			//	List<InterviewUsers> allUsersDataBeforeSorting=interviewRepository.findAll();
			//	allUsersDataBeforeSorting.stream().forEach(System.out::println);
					List<InterviewUsers> allUsersDataAfterSorting=	interviewRepository.findAll(Sort.by(Direction.DESC,"name","email"));
					allUsersDataAfterSorting.stream().forEach(System.out::println);
			
			}
			
			
			//Pagination
			//Get firstpage records
			public void getFirstPageRecords()
			{
			List<InterviewUsers> getData=	interviewRepository.findAll(Pageable.ofSize(10)).toList();
				getData.stream().forEach(System.out::println);
			}
		
	//Load the Data Page:4 and page size(number of records per page) :10
       public void   loadDataPagewiseRecords()
       {
    	   Pageable pagable=PageRequest.of(3, 10);//index start from 0,1,2,3
    	List<InterviewUsers> loadDataBypageWise=   interviewRepository.findAll(pagable).toList();
    	loadDataBypageWise.stream().forEach(System.out::println);
       }
     //Load the Data Page:4 and page size(number of records per page) :10 and Sorting
       public void   loadDataPagewiseRecordsSorting()
       {
    	   Pageable pagable=PageRequest.of(3,10,Sort.by("name"));//After sorting then the records will be fetched
    	   //means SORTING FIRST THEN PAGINATION EXECUTED
    	List<InterviewUsers> loadDataBypageWise=   interviewRepository.findAll(pagable).toList();
    	loadDataBypageWise.stream().forEach(System.out::println);
       }

       //Load the page no 5 with desc by email with pagesize 10
       public void loadDataByNamePaginationDesc()
       {
    	   Pageable pagable=PageRequest.of(4,10,Sort.by(Direction.DESC,"email"));
    	   List<InterviewUsers> loadDataBypageWiseByNameDesc=   interviewRepository.findAll(pagable).toList();
    	   loadDataBypageWiseByNameDesc.stream().forEach(System.out::println);
       }
       
       
       //Load the page no 2 with desc by email,name with page size 8
       public void loadDataByNameEmailPaginationDesc()
       {
    	   Pageable pagable=PageRequest.of(2,8,Sort.by(Direction.DESC,"email","name"));
    	   List<InterviewUsers> loadDataBypageWiseByNameEmailDesc=   interviewRepository.findAll(pagable).toList();
    	   loadDataBypageWiseByNameEmailDesc.stream().forEach(System.out::println);
       }
       
       

}
