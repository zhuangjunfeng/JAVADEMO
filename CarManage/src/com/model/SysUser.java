package com.model;


public class SysUser implements java.io.Serializable {

	private static final long serialVersionUID = 1035169925740314756L;
	private Long yhid;
	private String yhxm;
	private String yhgs;
	private String yhyx;
	private String yhmm;
	private String yhjs;
	private String yhzh;
	private Integer sjhm;
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
	public String getYhmm() {
		return yhmm;
	}
	public void setYhmm(String yhmm) {
		this.yhmm = yhmm;
	}
	public String getYhjs() {
		return yhjs;
	}
	public void setYhjs(String yhjs) {
		this.yhjs = yhjs;
	}
	public String getYhzh() {
		return yhzh;
	}
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}
	public Integer getSjhm() {
		return sjhm;
	}
	public void setSjhm(Integer sjhm) {
		this.sjhm = sjhm;
	}
	public String getYhxb() {
		return yhxb;
	}
	public void setYhxb(String yhxb) {
		this.yhxb = yhxb;
	}
}