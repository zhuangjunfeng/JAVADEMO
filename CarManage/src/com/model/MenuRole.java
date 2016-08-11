package com.model;

public class MenuRole implements java.io.Serializable {

	private static final long serialVersionUID = -2737132613427826162L;
	private String mrid;
	private String mrmc;
	private String cjsj;
	private String gxsj;
	private Long jsid;
	
	public String getMrid() {
		return mrid;
	}
	public void setMrid(String mrid) {
		this.mrid = mrid;
	}
	public String getMrmc() {
		return mrmc;
	}
	public void setMrmc(String mrmc) {
		this.mrmc = mrmc;
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