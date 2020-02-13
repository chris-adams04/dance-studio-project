package com.cg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserRegistration")
public class Registration {
	
	@Id
	@Column(length=10)
	private long phoneNo;
	@Column(length=15)
	private String name;
	@Column(length=30)
	private String email;
	@Column(length=2)
	private int age;
	@Column(length=6)
	private String gender;
	@Column(length=30)
	private String password;
	@Column(length=30)
	private String userType;
	
	public Registration() {
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	

	@Override
	public String toString() {
		return "Registration [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", age=" + age + ", gender="
				+ gender + ", password=" + password + ", userType=" + userType + "]";
	}

	public Registration(long phoneNo, String name, String email, int age, String gender, String password,
			String userType) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.password = password;
		this.userType = userType;
	}

	
}
