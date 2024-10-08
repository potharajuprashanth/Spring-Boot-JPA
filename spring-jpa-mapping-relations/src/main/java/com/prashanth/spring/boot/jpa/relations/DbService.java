package com.prashanth.spring.boot.jpa.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prashanth.spring.boot.jpa.relations.entity.AddressDetails;
import com.prashanth.spring.boot.jpa.relations.entity.EmployeeDetails;
import com.prashanth.spring.boot.jpa.relations.entity.repository.EmployeeRepository;

@Component
public class DbService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee()
	{
		EmployeeDetails emp1=new EmployeeDetails();
		
		emp1.setEmpName("Rohit");
		emp1.setEmail("rohit@gmail.com");
		emp1.setGender("Male");
		
		AddressDetails ad1=new AddressDetails();
		ad1.setCity("Mubai");
		ad1.setState("Maharastra");
		ad1.setCountry("India");
		ad1.setPinCode(400567);
		
		
		emp1.setAddressDetails(ad1);
		
		employeeRepository.save(emp1);
		
	}
	
	//delete 
	public void deleteEmployeeInfo()
	{
		employeeRepository.deleteById(1);
	}
	
	//select
	public void getEmployeeInfoById()
	{
		EmployeeDetails emp1=employeeRepository.findById(2).get();
		System.out.println(emp1);
	}
}
