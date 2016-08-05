package com.model;

/**
 * @dectiption:字典数据
 * @author Administrator
 *
 */

public class Dictionary implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -985974663105746173L;
	private Integer dictId;
	private String dictName;
	private String dictValue;
	private String dictType;
	private Integer isFixed;
	
	public Integer getDictId() {
		return dictId;
	}
	public void setDictId(Integer dictId) {
		this.dictId = dictId;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public String getDictType() {
		return dictType;
	}
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	public Integer getIsFixed() {
		return isFixed;
	}
	public void setIsFixed(Integer isFixed) {
		this.isFixed = isFixed;
	}
}