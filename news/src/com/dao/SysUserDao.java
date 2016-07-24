package com.dao;
import java.util.List;

import com.model.SysUser;

public interface SysUserDao 
{
	
	public List<SysUser> query(String usersName);
}
