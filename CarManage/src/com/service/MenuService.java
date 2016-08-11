package com.service;

import java.util.List;

import com.model.Menu;

public interface MenuService {
	public boolean addMenu(Menu menu);
	public boolean delMenu(Menu menu);
	public boolean updateMenu(Menu menu);
	public List<Menu> queryMenu();
}
