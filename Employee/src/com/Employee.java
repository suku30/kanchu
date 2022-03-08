package com;

public abstract class Employee {
	private int empId;
	private String name;
	private double basicpay;
	private double perksPay;
	public Employee(int empId, String name, double basicpay, double perksPay) {
		super();
		this.empId = empId;
		this.name = name;
		this.basicpay = basicpay;
		this.perksPay = perksPay;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getPerksPay() {
		return perksPay;
	}
	public void setPerksPay(double perksPay) {
		this.perksPay = perksPay;
	}
	
abstract double calculateSalary();
}
