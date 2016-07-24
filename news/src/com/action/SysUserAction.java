package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.SysUser;
import com.service.SysUserService;
import com.util.BaseAction;

public class SysUserAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  SysUser user;
	public String usersName;
	public String password;
	public String msg;
	public SysUserService sysUserService;
	/**
	 * 
	 * @decription£∫µ«¬º—È÷§
	 * @date 2016-7-18œ¬ŒÁ2:02:18
	 * @author£∫zhuangjf
	 */
	
	public String login() 
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		if (!usersName.equals("") && !password.equals(""))
		{
			SysUser UserRs = sysUserService.login(usersName,password);
			if (!UserRs.equals("")) {
				msg = "success";
				session.setAttribute("User", UserRs);
			} else {
				msg = "’À∫≈√‹¬Î¥ÌŒÛ";
			}			
		}
		else {
			msg = "’À∫≈√‹¬Î≤ªƒ‹Œ™ø’";
			return ERROR;
		}
		return SUCCESS;			
	}
	public SysUser getUser() {
		return user;
	}
	public void setUser(SysUser user) {
		this.user = user;
	}
	public String getUsersName() {
		return usersName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SysUserService getSysUserService() {
		return sysUserService;
	}
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}



}