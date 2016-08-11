package com.service.impl;

import java.util.List;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.service.SysUserService;
/**
 * @decription:用户模块Service实现类
 * @author zhuangjf
 */
@SuppressWarnings("rawtypes")
public class SysUserServiceImpl implements SysUserService{
	private SysUserDao sysUserDao;
	/**
	 * @decription:登录验证
	 * @author:zhaungjf
	 */
	public SysUser login(String yhzh, String password)
	{		

		SysUser sysUser = sysUserDao.query(yhzh);
		if (sysUser != null) {
			if (sysUser.getYhmm().equals(password))
				return sysUser;
		}
		return null;
	}
	/**
	 * @decription：增加用户
	 * @author：zhuangjf
	 */
	public   boolean addSysUser(SysUser sysUser){
		return sysUserDao.addSysUser(sysUser);
	}
	/**
	 * @decription：删除用户
	 * @author：zhuangjf
	 */
	public   boolean delSysUser(SysUser sysUser){
		try {
			sysUserDao.delSysUser(sysUser);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @decription：更新用户
	 * @author：zhuangjf
	 */
	public   boolean updateSysUsers(SysUser sysUser){
		return sysUserDao.updateSysUsers(sysUser);
	}
	/**
	 * @decription：查询用户
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers(){
		return sysUserDao.querySysUsers();
	}
	/**
	 * @decription：根据ID查询用户
	 * @author：zhuangjf
	 */
	public List querySingleSysUser(long yhid){
		return sysUserDao.querySingleSysUser(yhid);
	}
	//---------------set AND get------------------//
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	
}
