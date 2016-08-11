package com.dao;

import java.util.List;

import com.model.AuthRole;
@SuppressWarnings("rawtypes")
public interface AuthRoleDao {
	public boolean addAuthRole(AuthRole authRole);
	public boolean delAuthRole(AuthRole authRole);
	public boolean updateAuthRole(AuthRole authRole);
	public List<AuthRole> queryAuthRole();
	public List queryAuthRole(long arid);
}
