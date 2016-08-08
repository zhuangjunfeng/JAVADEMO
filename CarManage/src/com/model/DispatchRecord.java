package com.model;

public class DispatchRecord implements java.io.Serializable {

	private static final long serialVersionUID = 5280322285444338936L;
	private String dpid;
	private String cph0;
	private String sqsj;
	private String sqyg;
	private String dpsy;
	private String dpyy;
	private String cfsj;
	private String ddsj;
	
	public String getDpid() {
		return dpid;
	}
	public void setDpid(String dpid) {
		this.dpid = dpid;
	}
	public String getCph0() {
		return cph0;
	}
	public void setCph0(String cph0) {
		this.cph0 = cph0;
	}
	public String getSqsj() {
		return sqsj;
	}
	public void setSqsj(String sqsj) {
		this.sqsj = sqsj;
	}
	public String getSqyg() {
		return sqyg;
	}
	public void setSqyg(String sqyg) {
		this.sqyg = sqyg;
	}
	public String getDpsy() {
		return dpsy;
	}
	public void setDpsy(String dpsy) {
		this.dpsy = dpsy;
	}
	public String getDpyy() {
		return dpyy;
	}
	public void setDpyy(String dpyy) {
		this.dpyy = dpyy;
	}
	public String getCfsj() {
		return cfsj;
	}
	public void setCfsj(String cfsj) {
		this.cfsj = cfsj;
	}
	public String getDdsj() {
		return ddsj;
	}
	public void setDdsj(String ddsj) {
		this.ddsj = ddsj;
	}
}