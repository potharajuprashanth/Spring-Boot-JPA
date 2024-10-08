package com.prashanth.query.interview;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name="interview_users")
public class InterviewUsers {

//	CREATE TABLE interview_users (
//		    user_id serial PRIMARY KEY,   -- Unique ID for each user
	//	    name VARCHAR(100) NOT NULL,               -- User's full name
	//	    email VARCHAR(150) NOT NULL UNIQUE,       -- User's email address
	//	    phone_number VARCHAR(15),                 -- User's phone number
		//    interview_date DATE,                      -- Date of the interview
	//	    status VARCHAR(50)                        -- Status of the interview (e.g., scheduled, completed, etc.)
	//	);
	
	@Id
	private int userId;
	private String name;
	private String email;
	private String phoneNumber;
	private Date interviewDate;
	private String status;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InterviewUsers [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", interviewDate=" + interviewDate + ", status=" + status + "]";
	}
	
	
}
