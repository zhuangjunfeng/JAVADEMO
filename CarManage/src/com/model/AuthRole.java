package com.model;

public class AuthRole implements java.io.Serializable {

	private static final long serialVersionUID = 914280434348759371L;
	private Long arid;
	private String armc;
	private String cjsj;
	private String gxsj;
	private Long jsid;
	
	public Long getArid() {
		return arid;
	}
	public void setArid(Long arid) {
		this.arid = arid;
	}
	public String getArmc() {
		return armc;
	}
	public void setArmc(String armc) {
		this.armc = armc;
	}
	public String getCjsj() {
		return cjsj;
	}
	public void setCjsj(String cjsj) {
		this.cjsj = cjsj;
	}
	public String getGxsj() {
		return gxsj;
	}
	public void setGxsj(String gxsj) {
		this.gxsj = gxsj;
	}
	public Long getJsid() {
		return jsid;
	}
	public void setJsid(Long jsid) {
		this.jsid = jsid;
	}
}