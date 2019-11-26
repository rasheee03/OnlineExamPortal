package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ContactUs")
public class ContactUs {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opt_seq_mapping")
	@SequenceGenerator(name = "opt_seq_mapping", sequenceName = "opt_seq", allocationSize = 1)
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
