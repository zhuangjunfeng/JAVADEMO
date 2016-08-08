package com.model;

import java.math.BigDecimal;

public class SysUser implements java.io.Serializable {

	private static final long serialVersionUID = 1035169925740314756L;
	private Long yhid;
	private String yhxm;
	private String yhgs;
	private String yhyx;
	private String password;
	private String yhqx;
	private String yhzh;
	private BigDecimal phonenumber;
	private String yhxb;
	
	public Long getYhid() {
		return yhid;
	}
	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}
	public String getYhxm() {
		return yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getYhgs() {
		return yhgs;
	}
	public void setYhgs(String yhgs) {
		this.yhgs = yhgs;
	}
	public String getYhyx() {
		return yhyx;
	}
	public void setYhyx(String yhyx) {
		this.yhyx = yhyx;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getYhqx() {
		return yhqx;
	}
	public void setYhqx(String yhqx) {
		this.yhqx = yhqx;
	}
	public String getYhzh() {
		return yhzh;
	}
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}
	public BigDecimal getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(BigDecimal phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getYhxb() {
		return yhxb;
	}
	public void setYhxb(String yhxb) {
		this.yhxb = yhxb;
	}
}