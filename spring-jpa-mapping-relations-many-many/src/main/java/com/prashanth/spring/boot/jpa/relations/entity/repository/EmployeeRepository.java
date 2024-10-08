package com.prashanth.spring.boot.jpa.relations.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prashanth.spring.boot.jpa.relations.entity.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

}
