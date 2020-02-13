package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Choreographer")
@SequenceGenerator(name="choreographer_seq", initialValue=5555, allocationSize=100)
public class Choreographer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="choreographer_seq")
	@Column(length=10)
	private int cId;
	@Column(length=15)
	private String cName;
	@Column(length=10)
	private long phNo;
	@Column
	private String email;
	@Column(length=2)
	private int age;
	@Column(length=6)
	private String gender;
	@Column(length=30)
	private String danceType;
	@Column(length=15)
	private String city;
	@Column(length=20)
	private String area;
	@Column(length=10)
	private String place;
	@Column(length=3)
	private int noOfBookings;
	@Column
	private double charge;
	@Column
	private double costumeCharge;

	public Choreographer() {

	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	
	public int getNoOfBookings() {
		return noOfBookings;
	}

	public void setNoOfBookings(int noOfBookings) {
		this.noOfBookings = noOfBookings;
	}
	
	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}
	

	public double getCostumeCharge() {
		return costumeCharge;
	}

	public void setCostumeCharge(double costumeCharge) {
		this.costumeCharge = costumeCharge;
	}

	
	public Choreographer(int cId, String cName, long phNo, String email, int age, String gender, String danceType,
			String city, String area, String place, int noOfBookings, double charge, double costumeCharge) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.phNo = phNo;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.danceType = danceType;
		this.city = city;
		this.area = area;
		this.place = place;
		this.noOfBookings = noOfBookings;
		this.charge = charge;
		this.costumeCharge = costumeCharge;
	}

	@Override
	public String toString() {
		return "Choreographer [cId=" + cId + ", cName=" + cName + ", phNo=" + phNo + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", danceType=" + danceType + ", city=" + city + ", area=" + area + ", place="
				+ place + ", noOfBookings=" + noOfBookings + ", charge=" + charge + ", costumeCharge=" + costumeCharge
				+ "]";
	}

	
}
