package com.dao.impl;
/**
 * 用户模块DAO实现类
 */
import java.util.List;

import org.hibernate.Query;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.util.BasicHibernateDao;
@SuppressWarnings({"unchecked","rawtypes"})
public class SysUserDaoImpl  extends BasicHibernateDao implements SysUserDao{
	/**
	 * @decriptio：根据用户账户查询用户用于登录验证
	 * @author：zhuangjf
	 */
	public 	SysUser query(String yhzh)
	{	
		
		Query query = this.getSession().createQuery("from SysUser where Yhzh=?");
		query.setParameter(0,yhzh);
		
		List<SysUser> list = query.list();
		return list.size() == 0 ? null : list.get(0);				
	}
	/**
	 * @decriptio：增加用户
	 * @author：zhuangjf
	 */
	public   boolean addSysUser(SysUser sysUser){
		try {
			this.getSession().save(sysUser);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	/**
	 * @decriptio：删除用户
	 * @author：zhuangjf
	 */
	public   boolean delSysUser(SysUser sysUser){
		try {
			this.getSession().delete(sysUser);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * @decriptio：更新用户
	 * @author：zhuangjf
	 */
	public   boolean updateSysUsers(SysUser sysUser){
		try {
			this.getSession().update(sysUser);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @decriptio：查询用户
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers(){
		Query query = this.getSession().createQuery("from SysUser");
		List<SysUser> list = query.list();
		return list;
	}
	/**
	 * @decriptio：根据ID查询用户
	 * @author：zhuangjf
	 */
	public List querySingleSysUser(long yhid){
		Query query = this.getSession().createQuery("from SysUser where YhId=?");
		query.setLong(0, yhid);	
		List<SysUser> user_list=query.list();
		return user_list;
	}
}
