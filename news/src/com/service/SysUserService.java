package com.service;
import com.model.SysUser;


public interface SysUserService 
{
	public SysUser login(String usersName, String password);
}
