package com.dao;

import java.util.List;

import com.model.Menu;

public interface MenuDao {
	public boolean addMenu(Menu menu);
	public boolean delMenu(Menu menu);
	public boolean updateMenu(Menu menu);
	public List<Menu> queryMenu();
}
