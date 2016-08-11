package com.service;

import java.util.List;

import com.model.SysUser;
/**
 * @decription:用户模块Service接口
 * @author zhuangjf
 */
@SuppressWarnings("rawtypes")
public interface SysUserService {
	/**
	 * @decription：登录验证
	 * @date 2016-8-9下午12:01:40
	 * @author：zhuangjf
	 */
	public SysUser login(String yhzh, String password);
	/**
	 * @decription：增加用户
	 * @date 2016-8-11下午5:58:30
	 * @author：zhuangjf
	 */
	public   boolean addSysUser(SysUser sysUser);
	/**
	 * @decription：删除用户
	 * @date 2016-8-11下午5:58:38
	 * @author：zhuangjf
	 */
	public   boolean delSysUser(SysUser sysUser);
	/**
	 * @decription：更新用户
	 * @date 2016-8-11下午5:58:47
	 * @author：zhuangjf
	 */
	public   boolean updateSysUsers(SysUser sysUser);
	/**
	 * @decription：查询用户
	 * @date 2016-8-11下午5:58:56
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers();
	/**
	 * @decription：根据ID查询用户
	 * @date 2016-8-11下午5:59:07
	 * @author：zhuangjf
	 */
	public List querySingleSysUser(long yhid);
}
