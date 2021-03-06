package com.service;

import java.util.List;

import com.model.SysUserRole;

@SuppressWarnings("rawtypes")
public interface SysUserRoleService {
	
		public boolean addSysUserRole(SysUserRole sysUserRole);
		public boolean delSysUserRole(SysUserRole sysUserRole);
		public boolean updateSysUserRole(SysUserRole sysUserRole);
		public List<SysUserRole> querySysUserRole();
		public List querySysUserRoleByid(long srid);
}
