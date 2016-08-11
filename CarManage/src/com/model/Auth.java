package com.model;

public class Auth implements java.io.Serializable {

	private static final long serialVersionUID = 3787399553963312234L;
	private Long qxid;
	private String qxmc;
	private String cjsj;
	private String gxsj;
	private String url;
	
	public Long getQxid() {
		return qxid;
	}
	public void setQxid(Long qxid) {
		this.qxid = qxid;
	}
	public String getQxmc() {
		return qxmc;
	}
	public void setQxmc(String qxmc) {
		this.qxmc = qxmc;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}