package com.prashanth.spring.boot.jpa.relations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	   @ManyToMany(cascade=CascadeType.ALL)
	    @JoinTable(
	        name = "emp_roles",
	        joinColumns = @JoinColumn(name = "emp_id"), // FK to Employee
	        inverseJoinColumns = @JoinColumn(name = "role_id") // FK to Role
	    )
	   private List<Roles> roles;

	
}
