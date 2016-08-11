package com.service;

import java.util.List;

import com.model.MenuRole;
public interface MenuRoleService {
	public boolean addMenuRole(MenuRole menuRole);
	public boolean delMenuRole(MenuRole menuRole);
	public boolean updateMenuRole(MenuRole menuRole);
	public List<MenuRole> MenuRole();
}
