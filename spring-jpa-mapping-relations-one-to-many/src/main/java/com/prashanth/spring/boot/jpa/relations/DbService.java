package com.prashanth.spring.boot.jpa.relations;

import java.util.List;

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
		
		emp1.setEmpName("David");
		emp1.setEmail("virat@gmail.com");
		emp1.setGender("Male");
		
		AddressDetails ad1=new AddressDetails();
		ad1.setCity("Delhi");
		ad1.setState("UP");
		ad1.setCountry("India");
		ad1.setPinCode(400567);
		
		AddressDetails ad2=new AddressDetails();
		ad2.setCity("Bangalore");
		ad2.setState("Karnataka");
		ad2.setCountry("India");
		ad2.setPinCode(568344);
		
		AddressDetails ad3=new AddressDetails();
		ad3.setCity("Hyderabad");
		ad3.setState("TG");
		ad3.setCountry("India");
		ad3.setPinCode(500016);
		emp1.setAddressDetails(List.of(ad1,ad2,ad3));
		
		employeeRepository.save(emp1);
		
	}
	
	//delete 
	public void deleteEmployeeInfo()
	{
		employeeRepository.deleteById(52);
	}
	
	//select
	public void getEmployeeInfoById()
	{
		EmployeeDetails emp1=employeeRepository.findById(2).get();
		System.out.println(emp1);
	}
}
