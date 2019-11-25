package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="QuestionBank")
public class Question {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qb_seq_mapping")
		@SequenceGenerator(name = "qb_seq_mapping", sequenceName = "qb_seq", allocationSize = 1)
		private int qid;
		
		private String question;
		
		@ManyToOne
		@JoinColumn(name="cid")
		private Course courses;

		@OneToMany(mappedBy = "question", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
		private List<Option> options;
		
		@Column(name = "lvl")
		private int level;

		public List<Option> getOptions() {
			return options;
		}
		public void setOptions(List<Option> options) {
			this.options = options;
		}
		
		public int getQid() {
			return qid;
		}

		public void setQid(int qid) {
			this.qid = qid;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public Course getCourses() {
			return courses;
		}

		public void setCourses(Course courses) {
			this.courses = courses;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}
		
		
		
		
		
}
