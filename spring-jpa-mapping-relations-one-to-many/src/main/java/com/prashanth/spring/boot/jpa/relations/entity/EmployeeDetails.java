package com.prashanth.spring.boot.jpa.relations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employee_one_to_one_relations")
public class EmployeeDetails {

	@Id
	@GeneratedValue
	private int empId;
	
	private String empName;
	
	private String email;
	
	private String gender;
	
	//Emp having Many Address     1 Emp : N Address
	
	//@JoinColumn(name="emp_id")//If not use join then the new table will be created with relations below  other wise emp_id column wil be added to the address table 
	
	/*
	 * CREATE TABLE public.employee_one_to_one_relations_address_details (
	 * address_details_aid int4 NOT NULL, employee_details_emp_id int4 NOT NULL,
	 * CONSTRAINT employee_one_to_one_relations_address_d_address_details_aid_key
	 * UNIQUE (address_details_aid), CONSTRAINT fkde4pggfyyehi4xu5ei2yvt2n FOREIGN
	 * KEY (employee_details_emp_id) REFERENCES
	 * public.employee_one_to_one_relations(emp_id), CONSTRAINT
	 * fknr612wno9o9n0em2ywclxk2nw FOREIGN KEY (address_details_aid) REFERENCES
	 * public.emp_address_relations(aid) );
	 */
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) //(cascade=CascadeType.ALL)
	//use for select operation(fetch = FetchType.EAGER)
    List<AddressDetails> addressDetails;// More Than Address mean List<>
	
	
}
