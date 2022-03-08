
package com;

public class ConnectionDetails {
	private long mobileno;
	private int cusId;
	private int tariffId;
	private String connectionType;
	public ConnectionDetails(long mobileno, int cusId, int tariffId, String connectionType) {
		this.mobileno = mobileno;
		this.cusId = cusId;
		this.tariffId = tariffId;
		this.connectionType = connectionType;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getTariffId() {
		return tariffId;
	}
	public void setTariffId(int tariffId) {
		this.tariffId = tariffId;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	}
