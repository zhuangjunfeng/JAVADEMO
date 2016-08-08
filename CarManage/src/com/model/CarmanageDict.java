package com.model;

import java.math.BigDecimal;



public class CarmanageDict implements java.io.Serializable {

	private static final long serialVersionUID = -9220838243967383957L;
	private Long dictid;
	private String dicttype;
	private BigDecimal dictvalue;
	private String dictname;
	private Long isfixed;
	
	public Long getDictid() {
		return dictid;
	}
	public void setDictid(Long dictid) {
		this.dictid = dictid;
	}
	public String getDicttype() {
		return dicttype;
	}
	public void setDicttype(String dicttype) {
		this.dicttype = dicttype;
	}
	public BigDecimal getDictvalue() {
		return dictvalue;
	}
	public void setDictvalue(BigDecimal dictvalue) {
		this.dictvalue = dictvalue;
	}
	public String getDictname() {
		return dictname;
	}
	public void setDictname(String dictname) {
		this.dictname = dictname;
	}
	public Long getIsfixed() {
		return isfixed;
	}
	public void setIsfixed(Long isfixed) {
		this.isfixed = isfixed;
	}
}