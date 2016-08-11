package com.service.impl;

import java.util.List;

import com.dao.MenuDao;
import com.model.Menu;
import com.service.MenuService;

public class MenuServiceImpl implements MenuService {
	public MenuDao menuDao;
	public boolean addMenu(Menu menu){
		return menuDao.addMenu(menu);
	}
	public boolean delMenu(Menu menu){
		return menuDao.delMenu(menu);
	}
	public boolean updateMenu(Menu menu){
		return menuDao.updateMenu(menu);
	}
	public List<Menu> queryMenu(){
		return menuDao.queryMenu();
	}
	//-----------set AND get--------------//
	public MenuDao getMenuDao() {
		return menuDao;
	}
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
}
