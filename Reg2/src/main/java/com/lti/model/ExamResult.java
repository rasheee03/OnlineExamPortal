package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EXAMHISTORY")
public class ExamResult {
	
	@Id
	@Column(name="EID")
	private int eid;
	
	@Column(name="LID")
	private int lid;
	
	@Column(name="EXAMDATE")
	private LocalDate examdate;
	
	@Column(name="RESULT")
	private int id;
	
	@OneToOne
	@JoinColumn(name="cid")
	private Course course;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public LocalDate getExamdate() {
		return examdate;
	}

	public void setExamdate(LocalDate examdate) {
		this.examdate = examdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
