package com.model;

public class Menu implements java.io.Serializable {

	private static final long serialVersionUID = 9031672035620962167L;
	private Long cdid;
	private String url;
	private String cdmc;
	private String sffj;
	private String sfzj;
	private Long fjid;
	
	public Long getCdid() {
		return cdid;
	}
	public void setCdid(Long cdid) {
		this.cdid = cdid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCdmc() {
		return cdmc;
	}
	public void setCdmc(String cdmc) {
		this.cdmc = cdmc;
	}
	public String getSffj() {
		return sffj;
	}
	public void setSffj(String sffj) {
		this.sffj = sffj;
	}
	public String getSfzj() {
		return sfzj;
	}
	public void setSfzj(String sfzj) {
		this.sfzj = sfzj;
	}
	public Long getFjid() {
		return fjid;
	}
	public void setFjid(Long fjid) {
		this.fjid = fjid;
	}
}