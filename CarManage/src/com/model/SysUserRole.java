package com.model;

public class SysUserRole implements java.io.Serializable {
	private static final long serialVersionUID = 3558681329460497353L;
	private Long srid;
	private String srmc;
	private String cjsj;
	private String gxsj;
	private Long yhid;
	
	public Long getSrid() {
		return srid;
	}
	public void setSrid(Long srid) {
		this.srid = srid;
	}
	public String getSrmc() {
		return srmc;
	}
	public void setSrmc(String srmc) {
		this.srmc = srmc;
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
	public Long getYhid() {
		return yhid;
	}
	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}
}