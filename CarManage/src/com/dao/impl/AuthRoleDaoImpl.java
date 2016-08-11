package com.dao.impl;

import java.util.List;

import com.dao.AuthRoleDao;
import com.model.AuthRole;
import com.util.BasicHibernateDao;
@SuppressWarnings("rawtypes")
public class AuthRoleDaoImpl extends BasicHibernateDao implements AuthRoleDao {
	public boolean addAuthRole(AuthRole authRole){
		return true;
	}
	public boolean delAuthRole(AuthRole authRole){
		return true;
	}
	public boolean updateAuthRole(AuthRole authRole){
		return true;
	}
	public List<AuthRole> queryAuthRole(){
		return null;
	}
	public List queryAuthRole(long arid){
		return null;
	}
}
