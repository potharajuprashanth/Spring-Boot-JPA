package com.prashanth.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanth.query.interview.DMLoperations;
import com.prashanth.query.interview.InterviewDbOperations;
import com.prashanth.query.interview.SortingAndPagination;

@SpringBootApplication
public class SpringNativeQueryApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(SpringNativeQueryApplication.class, args);
	
	InterviewDbOperations iop=container.getBean(InterviewDbOperations.class);
	//iop.getAllUsersInfo();
	//iop.getUserByNameAndStatus("Jane Smith", "Completed");
	//iop.getUsersByDateAndEmail(Date.valueOf("2024-10-08"), "emily.davis@example.com" );
	
	
	//System.out.println("#################DML OPERATIONS##################");
	//DMLoperations db=container.getBean(DMLoperations.class);
	//db.updateUserStatus();
	
//	System.out.println("##########################JPQL JPQL JPQL###########################");
//	DMLoperations jpql=container.getBean(DMLoperations.class);
	//jpql.loadAllUsersByJpql();
//	jpql.loadUsersByPhoneNumberJpql("1122334455");

	
	System.out.println("####################SORTING##########################");
	SortingAndPagination sp=container.getBean(SortingAndPagination.class);
	//sp.loadDataOrderByDateAsc();
	//sp.loadDataOrderByDateDesc();
	//sp.loadDataOrderByAscEmailName();
	//sp.loadDataOrderByDESCEmailName();
	
	System.out.println("######################Pagination###########################");
	//sp.getFirstPageRecords();
	//sp.loadDataPagewiseRecords();
	//sp.loadDataPagewiseRecordsSorting();//pagination+sorting
	//sp.loadDataByNamePaginationDesc();//pagination+sorting
	sp.loadDataByNameEmailPaginationDesc();//pagination+sorting
	}
	
	
	
	

}
