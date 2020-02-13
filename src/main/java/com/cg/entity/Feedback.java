package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
@SequenceGenerator(name="feedback_seq", initialValue=1000, allocationSize=100)
public class Feedback {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="feedback_seq")
	@Column(length=10)
	private int feedbackId;
	@Column(length=15)
	private long candidateId;
	@Column(length=30)
	private String candidateName;
	@Column
	private String feedback;
	
	public Feedback() {
		
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Feedback(int feedbackId, long candidateId, String candidateName, String feedback) {
		super();
		this.feedbackId = feedbackId;
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", candidateId=" + candidateId + ", candidateName="
				+ candidateName + ", feedback=" + feedback + "]";
	}
	
	
}
