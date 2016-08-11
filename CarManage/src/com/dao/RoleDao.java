package com.dao;

import java.util.List;

import com.model.Role;
/**
 * @describtion：角色模块Dao接口
 * @author :zhuangjf
 * @date:下午7:00:43
 */
@SuppressWarnings("rawtypes")
public interface RoleDao {
	/**
	 * @decription：增加角色
	 * @date 2016-8-11下午7:01:02
	 * @author：zhuangjf
	 */
	public boolean addRole(Role role);
	/**
	 * @decription：删除角色
	 * @date 2016-8-11下午7:01:12
	 * @author：zhuangjf
	 */
	public boolean delRole(Role role);
	/**
	 * @decription：更新角色
	 * @date 2016-8-11下午7:01:24
	 * @author：zhuangjf
	 */
	public boolean updateRole(Role role);
	/**
	 * @decription：查询角色
	 * @date 2016-8-11下午7:01:31
	 * @author：zhuangjf
	 */
	public List<Role> queryRole();
	/**
	 * @decription：通过id查询角色
	 * @date 2016-8-11下午7:12:30
	 * @author：zhuangjf
	 */
	public List querySingleRole(long jsId);
}
