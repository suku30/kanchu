package com;

public class Customer {
	private int custId;
	private String custName;
	private char gender;
	private int age;
	private String emailId;
	private String address;
	public Customer(int custId, String custName, char gender, int age, String emailId, String address) {
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.age = age;
		this.emailId = emailId;
		this.address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
