package com.service.impl;

import java.util.List;

import com.dao.SysUserDao;
import com.model.SysUser;
import com.service.SysUserService;


public class SysUserServiceImpl implements SysUserService
{
	private SysUserDao sysUserDao;
	public SysUser login(String yhzh, String password)
	{		
//		List<SysUser> list=sysUserDao.query(yhzh);
//		SysUser User =list;		
//		if (!User.equals("")) {
//			if (User.getPassword().equals(password))
//				return User;
//		}
		SysUser sysUser = sysUserDao.query(yhzh);
		if (sysUser != null) {
			if (sysUser.getPassword().equals(password))
				return sysUser;
		}
		return null;
	}
	
	/**
	 * 增加用户
	 */
	public   boolean addSysUser(SysUser sysUser)
	{
		return sysUserDao.addSysUser(sysUser);
	}
	
	
	/**
	 * 删除用户
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
	 * 
	 * @decription：更新用户
	 * @date 2016-7-29上午11:40:17
	 * @author：zhuangjf
	 */
	public   boolean updateSysUsers(SysUser sysUser){
		return sysUserDao.updateSysUsers(sysUser);
	}
	/**
	 * 
	 * @decription：查询用户
	 * @date 2016-7-29上午11:46:55
	 * @author：zhuangjf
	 */
	public List<SysUser> querySysUsers(){
		return sysUserDao.querySysUsers();
	}
	/**
	 * 
	 * @decription：单条查询用户
	 * @date 2016-7-29上午11:59:05
	 * @author：zhuangjf
	 */
	public List querySingleSysUser(Integer yh_id){
		return sysUserDao.querySingleSysUser(yh_id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//------------get And set----------------------
	public SysUserDao getSysUserDao() {
		return sysUserDao;
	}
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}
	
	

	
}
