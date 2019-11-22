package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="QUESTIONPAPER")
public class QuestionPaper {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "opt_seq_mapping")
	@SequenceGenerator(name = "opt_seq_mapping", sequenceName = "opt_seq", allocationSize = 1)
	
	private int qpid;
	
	@OneToOne
	@JoinColumn(name="qid")
	private Question question;
	
	public int getQpid() {
		return qpid;
	}

	public void setQpid(int qpid) {
		this.qpid = qpid;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}


	

}
