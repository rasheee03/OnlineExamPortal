package com.lti.model;

import java.time.LocalDate;
import java.time.Year;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
	@Table(name="Registration")
	public class Registration {

		
		@Id
		@GeneratedValue
		private int id;
		private String name;
		private String email;
		private String password;
		private long mobile;
		private String qualification;
		private LocalDate dateOfBirth;
		private String city;
		private String state;
		
	
		@OneToOne( mappedBy="registration", cascade=CascadeType.ALL)
		private Login login;
		
		
public Login getLogin() {
			return login;
		}
		public void setLogin(Login login) {
			this.login = login;
		}
		//		private String captcha;
//		private String role;
//		
//		public String getRole() {
//			return role;
//		}
//		public void setRole(String role) {
//			this.role = role;
//		}
//		@OneToOne(fetch = FetchType.LAZY, optional = false)
//		@JoinColumn(name = "userid", nullable = false)
//		private Login login;
//		
//		public Login getLogin() {
//			return login;
//		}
//		public void setLogin(Login login) {
//			this.login = login;
//		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		
	
	
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
	
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		

		

}
