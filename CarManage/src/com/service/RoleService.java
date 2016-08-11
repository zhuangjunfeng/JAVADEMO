package com.service;

import java.util.List;

import com.model.Role;
/**
 * @describtion：角色模块Service接口
 * @author :zhuangjf
 * @date:下午6:57:51
 */
@SuppressWarnings("rawtypes")
public interface RoleService {
	/**
	 * @decription：增加角色
	 * @date 2016-8-11下午6:58:37
	 * @author：zhuangjf
	 */
	public boolean addRole(Role role);
	/**
	 * @decription：删除角色
	 * @date 2016-8-11下午6:58:46
	 * @author：zhuangjf
	 */
	public boolean delRole(Role role);
	/**
	 * @decription：更新角色
	 * @date 2016-8-11下午6:58:53
	 * @author：zhuangjf
	 */
	public boolean updateRole(Role role);
	/**
	 * @decription：查询角色
	 * @date 2016-8-11下午6:59:01
	 * @author：zhuangjf
	 */
	public List<Role> queryRole();
	/**
	 * @decription：通过id查询角色
	 * @date 2016-8-11下午7:11:08
	 * @author：zhuangjf
	 */
	public List querySingleRole(long jsId);
}
