package com.service;
import java.util.List;

import com.model.SysUser;


public interface SysUserService 
{
	public SysUser login(String yhzh, String password);
	public   boolean addSysUser(SysUser sysUser);
	public   boolean delSysUser(SysUser sysUser);
	public   boolean updateSysUsers(SysUser sysUser);
	
	public List<SysUser> querySysUsers();
	@SuppressWarnings("rawtypes")
	public List querySingleSysUser(Integer yh_id);
}
