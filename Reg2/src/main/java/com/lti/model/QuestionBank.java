package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="QuestionBank")
public class QuestionBank {
	
		@Id
		@GeneratedValue
		private int qid;
		
		private String question;
		
		@ManyToOne
		@JoinColumn(name="cid")
		private Courses courses;
		
		private int level;

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

		public Courses getCourses() {
			return courses;
		}

		public void setCourses(Courses courses) {
			this.courses = courses;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}
		
		
		
		
		
}
