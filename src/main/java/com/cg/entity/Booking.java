package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
@SequenceGenerator(name="booking_seq", initialValue=2222, allocationSize=100)
public class Booking {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="booking_seq")
	@Column(length=10)
	private int bookingId;
	@Column(length=15)
	private long candidateId;
	@Column(length=30)
	private String candidate;
	@Column(length=15)
	private int choreographerId;
	@Column(length=30)
	private String choreographer;
	@Column(length=15)
	private String danceType;
	@Column(length=20)
	private String city;
	@Column
	private String area;
	@Column(length=10) 
	private String place;
	@Column(length=30) 
	private String costumeStatus;
	@Column(length=30)
	private String bookingStatus;
	@Column
	private double charge;
	@Column
	private String reward;
	@Column
	private String rank;
	@Column
	private double totalFee;
	@Column
	private String feeStatus;
	
	public Booking() {

	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public String getChoreographer() {
		return choreographer;
	}

	public void setChoreographer(String choreographer) {
		this.choreographer = choreographer;
	}

	public String getDanceType() {
		return danceType;
	}

	public void setDanceType(String danceType) {
		this.danceType = danceType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	public long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(long candidateId) {
		this.candidateId = candidateId;
	}

	public int getChoreographerId() {
		return choreographerId;
	}

	public void setChoreographerId(int choreographerId) {
		this.choreographerId = choreographerId;
	}
	

	public double getCharge() { 
		return charge;
	}

	public void setCharge(double charge) { 
		this.charge = charge; 
	}

	public String getCostumeStatus() {
		return costumeStatus;
	}

	public void setCostumeStatus(String costumeStatus) {
		this.costumeStatus = costumeStatus;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}


	public double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}

	public String getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}


	public Booking(int bookingId, long candidateId, String candidate, int choreographerId, String choreographer,
			String danceType, String city, String area, String place, String costumeStatus, String bookingStatus,
			double charge, String reward, String rank, double totalFee, String feeStatus) {
		super();
		this.bookingId = bookingId;
		this.candidateId = candidateId;
		this.candidate = candidate;
		this.choreographerId = choreographerId;
		this.choreographer = choreographer;
		this.danceType = danceType;
		this.city = city;
		this.area = area;
		this.place = place;
		this.costumeStatus = costumeStatus;
		this.bookingStatus = bookingStatus;
		this.charge = charge;
		this.reward = reward;
		this.rank = rank;
		this.totalFee = totalFee;
		this.feeStatus = feeStatus;
	}

	

	
	
}
