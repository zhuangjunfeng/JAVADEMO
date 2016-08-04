package com.dao;
import java.util.List;

import com.model.SysUser;
/**
 * @decription:新闻管理用户模块dao接口
 * @author zhuangjf
 *
 */
public interface SysUserDao 
{
	/**
	 * 
	 * @decription：通过用户账户查询用户
	 * @date 2016-8-3下午11:48:46
	 * @author：zhuangjf
	 * @param：yhzh用户账户
	 */
	public SysUser query(String yhzh);
	/**
	 * 
	 * @decription：添加用户
	 * @date 2016-8-3下午11:49:46
	 * @author：zhuangjf
	 */
	public boolean addSysUser(SysUser sysUser);
	/**
	 * 
	 * @decription：删除用户
	 * @date 2016-8-3下午11:50:12
	 * @author：zhuangjf
	 */
	public boolean delSysUser(SysUser sysUser);
	/**
	 * 
	 * @decription：更新用户
	 * @date 2016-8-3下午11:50:21
	 * @author：zhuangjf
	 */
	public boolean updateSysUsers(SysUser sysUser);
	/**
	 * 
	 * @decription：查询全部用户
	 * @date 2016-8-3下午11:50:36
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers();
	/**
	 * 
	 * @decription：通过用户id单条查询用户
	 * @date 2016-8-3下午11:50:49
	 * @author：zhuangjf
	 * @param：yh_id 用户id
	 */
	public List querySingleSysUser(int yh_id);
}
