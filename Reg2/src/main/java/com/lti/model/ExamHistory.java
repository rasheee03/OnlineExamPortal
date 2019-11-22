package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ExamHistory")
public class ExamHistory {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opt_seq_mapping")
	@SequenceGenerator(name = "opt_seq_mapping", sequenceName = "opt_seq", allocationSize = 1)
	private int eid;
		
		@OneToOne()
		@JoinColumn(name = "lid", nullable = false)
		private Login login;
		
		private LocalDateTime examDate;
		private int result;
		
		@OneToOne(fetch = FetchType.LAZY, optional = false)
		@JoinColumn(name = "cid", nullable = false)
		private Course course;

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public Login getLogin() {
			return login;
		}

		public void setLogin(Login login) {
			this.login = login;
		}

		public LocalDateTime getExamDate() {
			return examDate;
		}

		public void setExamDate(LocalDateTime examDate) {
			this.examDate = examDate;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}

		public Course getCourse() {
			return course;
		}

		public void setCourse(Course course) {
			this.course = course;
		}

		
	}

