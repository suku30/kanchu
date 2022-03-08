package com;

public class Associate extends Employee{
	public Associate(int empId, String name, double basicpay, double perksPay) {
		super(empId, name, basicpay, perksPay);
		// TODO Auto-generated constructor stub
	}
	double calculatesalary()
	{
		return getBasicpay()+getPerksPay();
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return getBasicpay()+getPerksPay();
	}

}
