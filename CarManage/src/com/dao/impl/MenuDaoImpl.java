package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.MenuDao;
import com.model.Menu;
import com.util.BasicHibernateDao;
@SuppressWarnings("unchecked")
public class MenuDaoImpl extends BasicHibernateDao implements MenuDao {
	public boolean addMenu(Menu menu){
		try {
			this.getSession().save(menu);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	public boolean delMenu(Menu menu){
		try {
			this.getSession().delete(menu);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean updateMenu(Menu menu){
		try {
			this.getSession().update(menu);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List<Menu> queryMenu(){
		Query query = this.getSession().createQuery("from Menu");
		List<Menu> list = query.list();
		return list;
	}
}
