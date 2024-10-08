package com.prashanth.spring.boot.jpa.relations.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="roles_many_to_many")
public class Roles {

	@Id
	private int roleId;
	private String roleName;
	
	
	@ManyToMany(mappedBy = "roles")
	private List<EmployeeDetails> employeeDetails;
	
	
}
