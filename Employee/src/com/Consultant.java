package com;

public class Consultant extends Employee {
	private double consultingFees;

	public double getConsultingFees() {
		return consultingFees;
	}

	public void setConsultingFees(double consultingFees) {
		this.consultingFees = consultingFees;
	}

	public Consultant(int empId, String name, double basicpay, double perksPay, double consultingFees) {
		super(empId, name, basicpay, perksPay);
		this.consultingFees = consultingFees;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return getBasicpay()+getPerksPay()+getConsultingFees();
	}


}
