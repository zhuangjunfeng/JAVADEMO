package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.RoleDao;
import com.model.Role;
import com.util.BasicHibernateDao;
/**
 * @describtion：角色模块Dao实现类
 * @author :zhuangjf
 * @date:下午7:01:50
 */
@SuppressWarnings({"unchecked","rawtypes"})	
public class RoleDaoImpl  extends BasicHibernateDao implements RoleDao{
	/**
	 * @describtion：增加角色
	 * @author：zhuangjf
	 */
	public boolean addRole(Role role){
		try {
			this.getSession().save(role);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	/**
	 * @describtion：删除角色
	 * @author：zhuangjf
	 */
	public boolean delRole(Role role){
		try {
			this.getSession().delete(role);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * @describtion：更新角色
	 * @author：zhuangjf
	 */
	public boolean updateRole(Role role){
		try {
			this.getSession().update(role);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * @describtion：查询角色
	 * @author：zhuangjf
	 */
	public List<Role> queryRole(){
		Query query = this.getSession().createQuery("from Role");
		List<Role> list = query.list();
		return list;
	}
	/**
	 * @describtion：根据ID查询角色
	 * @author：zhuangjf
	 */
	public List querySingleRole(long jsId){
		Query query = this.getSession().createQuery("from SysUser where JsId=?");
		query.setLong(0, jsId);	
		List<Role> list=query.list();
		return list;
	}
}
