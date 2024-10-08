package com.prashanth.spring.boot.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_summary")
public class PatientSummary {

	@Id
	@Column(name="pat_id")
	private int patientId;
	
	@Column(name="f_name")
	private String firstName;
	
	private String lastName;
	
	@Column(name="")
	private String email;
	
	
	private String gender;
	
	private long contact;
}
