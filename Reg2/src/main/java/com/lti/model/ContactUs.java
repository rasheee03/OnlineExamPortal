package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ContactUs")
public class ContactUs {

	
	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private String email;
	private long mobile;
	private int message ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	
}
