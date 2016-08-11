package com.dao;

import java.util.List;

import com.model.SysUser;
/**
 * @decription:用户模块dao接口
 * @author zhuangjf
 */
@SuppressWarnings("rawtypes")
public interface SysUserDao {
	/**
	 * @decription：根据用户账户单条查询
	 * @date 2016-8-9下午12:03:44
	 * @author：zhuangjf
	 */
	public SysUser query(String yhzh);
	/**
	 * @decription：增加用户
	 * @date 2016-8-11下午6:00:48
	 * @author：zhuangjf
	 */
	public   boolean addSysUser(SysUser sysUser);
	/**
	 * @decription：删除用户
	 * @date 2016-8-11下午6:00:55
	 * @author：zhuangjf
	 */
	public   boolean delSysUser(SysUser sysUser);
	/**
	 * @decription：更新用户
	 * @date 2016-8-11下午6:01:07
	 * @author：zhuangjf
	 */
	public   boolean updateSysUsers(SysUser sysUser);
	/**
	 * @decription：查询用户
	 * @date 2016-8-11下午6:01:15
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers();
	/**
	 * @decription：根据ID查询用户
	 * @date 2016-8-11下午6:01:26
	 * @author：zhuangjf
	 */
	public List querySingleSysUser(long yhid);
}
