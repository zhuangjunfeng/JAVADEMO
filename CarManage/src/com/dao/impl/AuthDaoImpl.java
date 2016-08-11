package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.AuthDao;
import com.model.Auth;
import com.util.BasicHibernateDao;
@SuppressWarnings("unchecked")
public class AuthDaoImpl extends BasicHibernateDao implements AuthDao {
	public boolean addAuth(Auth auth){
		try {
			this.getSession().save(auth);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	public boolean delAuth(Auth auth){
		try {
			this.getSession().delete(auth);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean updateAuth(Auth auth){
		try {
			this.getSession().update(auth);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List<Auth> queryAuth(){
		Query query = this.getSession().createQuery("from Auth");
		List<Auth> list = query.list();
		return list;
	}
}
