package com;

public class Tariff {
	private int tariffId;
	private String tariffName;
	private String planType;
	private double charge;
	private int validity;
	public Tariff(int tariffId, String tariffName, String planType, double charge, int validity) {
		this.tariffId = tariffId;
		this.tariffName = tariffName;
		this.planType = planType;
		this.charge = charge;
		this.validity = validity;
	}
	public int getTariffId() {
		return tariffId;
	}
	public void setTariffId(int tariffId) {
		this.tariffId = tariffId;
	}
	public String getTariffName() {
		return tariffName;
	}
	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	
	

}
