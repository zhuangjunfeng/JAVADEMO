package com.service.impl;

import java.util.List;

import com.dao.RoleDao;
import com.model.Role;
import com.service.RoleService;
/**
 * @describtion：角色模块Service实现类
 * @author :zhuangjf
 * @date:下午6:58:14
 */
@SuppressWarnings("rawtypes")
public class RoleServiceImpl implements RoleService {
	public RoleDao roleDao;
	/**
	 * @describtion：增加角色
	 * @author：zhuangjf
	 */
	public boolean addRole(Role role){
		return roleDao.addRole(role);
	}
	/**
	 * @describtion：删除角色
	 * @author：zhuangjf
	 */
	public boolean delRole(Role role){
		return roleDao.delRole(role);
	}
	/**
	 * @describtion：更新角色
	 * @author：zhuangjf
	 */
	public boolean updateRole(Role role){
		return roleDao.updateRole(role);
	}
	/**
	 * @describtion：查询角色
	 * @author：zhuangjf
	 */
	public List<Role> queryRole(){
		return roleDao.queryRole();
	}
	
	public List querySingleRole(long jsId){
		return roleDao.querySingleRole(jsId);
	}
	//-----------set AND get-------------//
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
}
