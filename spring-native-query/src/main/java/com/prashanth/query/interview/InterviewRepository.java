package com.prashanth.query.interview;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

@Transactional// when we define at class level it is applicable for all the methods inside the class
public interface InterviewRepository extends JpaRepository<InterviewUsers, Integer>{

	@Query(value="select * from interview_users ;",nativeQuery=true)
	List<InterviewUsers> loadAllUsersInfo();
	
	//indexed positional params  the confusion of order 
	@Query(value="select * from interview_users where name=?1and status=?2",nativeQuery=true)
	List<InterviewUsers> loadAllUsersByNameAndStatusInfo(String name,String status);
	
	//Named parameters  //there is no order of conflict
	@Query(value="select * from interview_users where interview_date=:interviewDate  and email=:email",nativeQuery=true)
	List<InterviewUsers> loadDataByDateAndEmail( @Param("interviewDate") Date date,@Param("email") String email);
	
	
	//DML
	//UPDATE
//	@Transactional  we can use method or class level //if we use at method level then it is applicable for that particular method
	
	@Modifying
	@Query(value="update interview_users set status=:status where user_id=:userId",nativeQuery=true)
	public int updateUserStatusByUserId(  @Param("userId") int userId,@Param("status") String status);
	
	
	//######################JPQL
	
	@Query(value="select i from InterviewUsers i ")//nativeQuery=false no need to give by default false only
	public List<InterviewUsers> loadAllUsersData();
	
	//JPQL
	@Query(value="select i from InterviewUsers i where i.phoneNumber=:phoneNumber")//nativeQuery=false no need to give by default false only
	public List<InterviewUsers> loadUsersByJpqlPhoneNumber(@Param("phoneNumber") String phone);

}
