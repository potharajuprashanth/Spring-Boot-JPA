package com.prashanth.spring.boot.jpa.relations.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emp_dept_id")
	Departments departments;
	
}
