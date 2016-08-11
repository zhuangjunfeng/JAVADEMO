package com.model;

public class Mechanism implements java.io.Serializable {

	private static final long serialVersionUID = -4569152975201493201L;
	private int jgid;
	private String jgmc;
	private String jglx;
	private String jgdz;
	private String qxdj;
	private String jgsd;
	private Integer ygrs;
	
	public int getJgid() {
		return jgid;
	}
	public void setJgid(int jgId) {
		this.jgid = jgId;
	}
	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc = jgmc;
	}
	public String getJglx() {
		return jglx;
	}
	public void setJglx(String jglx) {
		this.jglx = jglx;
	}
	public String getJgdz() {
		return jgdz;
	}
	public void setJgdz(String jgdz) {
		this.jgdz = jgdz;
	}
	public String getQxdj() {
		return qxdj;
	}
	public void setQxdj(String qxdj) {
		this.qxdj = qxdj;
	}
	public String getJgsd() {
		return jgsd;
	}
	public void setJgsd(String jgsd) {
		this.jgsd = jgsd;
	}
	public Integer getYgrs() {
		return ygrs;
	}
	public void setYgrs(Integer ygrs) {
		this.ygrs = ygrs;
	}
}