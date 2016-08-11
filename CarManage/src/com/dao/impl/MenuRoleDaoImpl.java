package com.dao.impl;

import java.util.List;

import com.dao.MenuRoleDao;
import com.model.MenuRole;
import com.util.BasicHibernateDao;

public class MenuRoleDaoImpl extends BasicHibernateDao implements MenuRoleDao {
	public boolean addMenuRole(MenuRole menuRole){
		return true;
	}
	public boolean delMenuRole(MenuRole menuRole){
		return true;
	}
	public boolean updateMenuRole(MenuRole menuRole){
		return true;
	}
	public List<MenuRole> MenuRole(){
		return null;
	}
}
