package com.model;

public class Role implements java.io.Serializable {

	private static final long serialVersionUID = -3381518971281584008L;

	private Long jsid;
	private String jsmc;
	private String cjsj;
	private String gxsj;
	private String jszt;
	
	public Long getJsid() {
		return jsid;
	}
	public void setJsid(Long jsid) {
		this.jsid = jsid;
	}
	public String getJsmc() {
		return jsmc;
	}
	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
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
	public String getJszt() {
		return jszt;
	}
	public void setJszt(String jszt) {
		this.jszt = jszt;
	}
}