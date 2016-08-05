package com.model;



/**
 * 
 * @decription：系统用户
 * @author MyEclipse Persistence Tools
 */

public class SysUser  implements java.io.Serializable {

     /**
	 * 
	 */
	private static final long serialVersionUID = 970568909204827042L;
	private Integer yhId;
     private String yhxm;
     private String password;
     private String yhxb;
     private String yhyx;
     private String yhzh;
	public Integer getYhId() {
		return yhId;
	}
	public void setYhId(Integer yhId) {
		this.yhId = yhId;
	}
	public String getYhxm() {
		return yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getYhxb() {
		return yhxb;
	}
	public void setYhxb(String yhxb) {
		this.yhxb = yhxb;
	}
	public String getYhyx() {
		return yhyx;
	}
	public void setYhyx(String yhyx) {
		this.yhyx = yhyx;
	}
	public String getYhzh() {
		return yhzh;
	}
	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	} 
}