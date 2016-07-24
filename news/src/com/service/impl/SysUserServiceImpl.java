package com.service.impl;

import java.util.List;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.service.SysUserService;

public class SysUserServiceImpl implements SysUserService
{
	private SysUserDao sysUserDao;
	public SysUser login(String usersName, String password)
	{		
		List<SysUser> list=sysUserDao.query(usersName);
		SysUser User = (SysUser)list;		
		if (!User.equals(null)) {
			if (User.getPassword().equals(password))
				return User;
		}
		return null;
	}
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	
	

	
}
