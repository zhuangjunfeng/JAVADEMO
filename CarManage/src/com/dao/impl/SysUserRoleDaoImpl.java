package com.dao.impl;

import java.util.List;

import com.dao.SysUserRoleDao;
import com.model.SysUserRole;
import com.util.BasicHibernateDao;
@SuppressWarnings("rawtypes")
public class SysUserRoleDaoImpl extends BasicHibernateDao implements SysUserRoleDao {
	public boolean addSysUserRole(SysUserRole sysUserRole){
		return true;
	}
	public boolean delSysUserRole(SysUserRole sysUserRole){
		return true;
	}
	public boolean updateSysUserRole(SysUserRole sysUserRole){
		return true;
	}
	public List<SysUserRole> querySysUserRole(){
		return null;
	}
	public List querySysUserRoleByid(long srid){
		return null;
	}
}
