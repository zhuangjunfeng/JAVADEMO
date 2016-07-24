package com.model;

/**
 * Sysuser entity. @author MyEclipse Persistence Tools
 */

public class SysUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private String usersname;
	private String password;

	// Constructors

	/** default constructor */
	public SysUser() {
	}

	/** minimal constructor */
	public SysUser(String usersname) {
		this.usersname = usersname;
	}

	/** full constructor */
	public SysUser(String usersname, String password) {
		this.usersname = usersname;
		this.password = password;
	}

	// Property accessors

	public String getUsersname() {
		return this.usersname;
	}

	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}