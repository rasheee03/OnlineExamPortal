package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name="qid")
	private Question question;
	
	@OneToOne
	@JoinColumn(name="examid")
	private ExamHistory examHistory;
	
	private String answer;
	
	
	public ExamHistory getExamHistory() {
		return examHistory;
	}

	public void setExamHistory(ExamHistory examHistory) {
		this.examHistory = examHistory;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

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
