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
	public 	SysUser query(String yhzh)
	{	
		
		Query query = this.getSession().createQuery("from SysUser where Yhzh=?");
		query.setParameter(0,yhzh);
		List<SysUser> list = query.list();
		return list.size() == 0 ? null : list.get(0);				
	}
	
	public boolean addSysUser(SysUser sysUser){
		try {
			this.getSession().save(sysUser);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	
	
	
	public boolean delSysUser(SysUser sysUser)
	{
			try {
				this.getSession().delete(sysUser);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
	}
	

	
	public boolean updateSysUsers(SysUser sysUser){
		try {
			this.getSession().update(sysUser);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<SysUser> querySysUsers(){
		Query query = this.getSession().createQuery("from SysUser");
		List<SysUser> list = query.list();
		return list;
	}
	
	
	public List querySingleSysUser(int yh_id){
		Query query = this.getSession().createQuery("from SysUser where YhId=?");
		query.setLong(0, yh_id);
		List<SysUser> user_list=query.list();
		return user_list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------get And set-----------------------
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
