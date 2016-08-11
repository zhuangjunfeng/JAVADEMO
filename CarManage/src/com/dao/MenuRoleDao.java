package com.dao;

import java.util.List;

import com.model.MenuRole;

public interface MenuRoleDao {
	public boolean addMenuRole(MenuRole menuRole);
	public boolean delMenuRole(MenuRole menuRole);
	public boolean updateMenuRole(MenuRole menuRole);
	public List<MenuRole> MenuRole();
}
