package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Options")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opt_seq_mapping")
	@SequenceGenerator(name = "opt_seq_mapping", sequenceName = "opt_seq", allocationSize = 1)
	private int opid;
	
	@ManyToOne
	@JoinColumn(name="qid")
	private Question question;
	
	private String isCorrectAnswer;
	
	private String description;

	public int getOpid() {
		return opid;
	}

	public void setOpid(int opid) {
		this.opid = opid;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question questionBank) {
		this.question = questionBank;
	}

	
	public String getIsCorrectAnswer() {
		return isCorrectAnswer;
	}

	public void setIsCorrectAnswer(String isCorrectAnswer) {
		this.isCorrectAnswer = isCorrectAnswer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
