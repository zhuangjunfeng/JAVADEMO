package com.dao.impl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.SysUserDao;
import com.model.SysUser;


public class SysUserDaoImpl implements SysUserDao
{
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	public 	List<SysUser> query(String usersName)
	{	
		
		Query query = this.getSession().createQuery("from SysUser where Usersname=£¿");
		List<SysUser> list = query.list();	
		return list;
				
	}
	
	
	
	
	
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
