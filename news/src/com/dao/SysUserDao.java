package com.dao;
import java.util.List;

import com.model.SysUser;

public interface SysUserDao 
{
	
	public SysUser query(String yhzh);
	public boolean addSysUser(SysUser sysUser);
	public boolean delSysUser(SysUser sysUser);
	public boolean updateSysUsers(SysUser sysUser);
	public List<SysUser> querySysUsers();
	public List querySingleSysUser(int yh_id);
}
