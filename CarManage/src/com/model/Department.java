package com.model;

public class Department implements java.io.Serializable {

	private static final long serialVersionUID = 9191531243390828224L;
	private String bmid;
	private String bmmc;
	private String bmms;
	private String bmqx;
	private String ssjg;
	
	public String getBmid() {
		return bmid;
	}
	public void setBmid(String bmid) {
		this.bmid = bmid;
	}
	public String getBmmc() {
		return bmmc;
	}
	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}
	public String getBmms() {
		return bmms;
	}
	public void setBmms(String bmms) {
		this.bmms = bmms;
	}
	public String getBmqx() {
		return bmqx;
	}
	public void setBmqx(String bmqx) {
		this.bmqx = bmqx;
	}
	public String getSsjg() {
		return ssjg;
	}
	public void setSsjg(String ssjg) {
		this.ssjg = ssjg;
	}
}