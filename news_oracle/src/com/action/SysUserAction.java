package com.action;
/**
 * 用户模块Action类
 */
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.SysUser;
import com.service.SysUserService;
import com.util.BaseAction;

@SuppressWarnings({"rawtypes","unchecked","unused"})		
public class SysUserAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	public  SysUser sysUser;
	public String usersName;
	public String password;
	public String msg;
	public SysUserService sysUserService;
	public List userList;
	public List singleUserList;
	
	/**
	 * 
	 * @decription：登录验证
	 * @date 2016-7-29上午10:27:14
	 * @author：zhuangjf
	 */
	public String login() 
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		String yhzh=req.getParameter("yhzh");
		String password= req.getParameter("password");
		if (!yhzh.equals("") && !password.equals(""))
		{
			SysUser UserRs = sysUserService.login(yhzh,password);
			if (UserRs!=null) {
				msg = "success";
				session.setAttribute("User", UserRs);
				return SUCCESS;	
			} else {
				msg = "用户名密码错误";
				return ERROR;
			}			
		}
		else {
			msg = "用户名密码不能为空";
			return ERROR;
		}
			
	}
	/**
	 * 
	 * @decription：用户登出
	 * @date 2016-8-2下午8:13:05
	 * @author：zhuangjf
	 */
	public String logout(){
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		try {
			session.setAttribute("User", null);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	/**
	 * 
	 * @decription：增加用户
	 * @date 2016-7-29上午11:03:46
	 * @author：zhuangjf
	 */

	public String addSysUser(){
		HttpServletRequest req = getRequest();
		String yhxm = req.getParameter("yhxm");
		String password= req.getParameter("password");
		String yhxb = req.getParameter("yhxb");
		String yhzh=req.getParameter("yhzh");
		String yhyx=req.getParameter("yhyx");
	

		sysUser = new SysUser();	
		sysUser.setYhzh(yhzh);
		sysUser.setYhyx(yhyx);
		sysUser.setYhxm(yhxm);
		sysUser.setPassword(password);
		sysUser.setYhxb(yhxb);

		Boolean res =sysUserService.addSysUser(sysUser);
		if (res) {
			userList.add(sysUser);
			return SUCCESS;
		} else {
			return null;
		}
	}
	/**
	 * 
	 * @decription：删除用户
	 * @date 2016-7-29上午11:04:28
	 * @author：zhuangjf
	 */
	public String delSysUser() 
	{
		HttpServletRequest req = getRequest();
		String yhId=req.getParameter("yhId");
		int YhId=Integer.parseInt(yhId);
		if(YhId!=0)
		{
			SysUser sysUserObj=new SysUser();
			sysUserObj.setYhId(YhId);
		
			if (sysUserService.delSysUser(sysUserObj)) 
			{
				msg = "success";
				return SUCCESS;
			} 
			else 
			{
				msg = "error_sys";
				return ERROR;
			}
		}
		else
		{
			msg = "error_none";
			return ERROR;
		}
	}
	/**
	 *
	 * @decription：更新用户信息
	 * @date 2016-8-3下午11:25:06
	 * @author：zhuangjf
	 */
	public String updateSysUser() 
	{
		HttpServletRequest req = getRequest();
		String yhxm = req.getParameter("yhxm");
		String password= req.getParameter("password");
		String yhxb = req.getParameter("yhxb");
		String yhzh=req.getParameter("yhzh");
		String yhyx=req.getParameter("yhyx");
		int yhId= Integer.parseInt(req.getParameter("yhId"));
	

		sysUser = new SysUser();	
		sysUser.setYhzh(yhzh);
		sysUser.setYhyx(yhyx);
		sysUser.setYhxm(yhxm);
		sysUser.setPassword(password);
		sysUser.setYhxb(yhxb);
		sysUser.setYhId(yhId);
		if (sysUserService.updateSysUsers(sysUser))
			{
				msg="success";
				return SUCCESS;
			}
		else
			{
				msg="error";
				return ERROR;
			}		
		
	}

	/**
	 * 
	 * @decription：查询用户
	 * @date 2016-7-29上午11:44:13
	 * @author：zhuangjf
	 */
	public String querySysUser()
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		userList = sysUserService.querySysUsers();
		return SUCCESS;
	}
	/**
	 *
	 * @decription：单条查询用户信息
	 * @date 2016-8-3下午11:25:29
	 * @author：zhuangjf
	 */
	public String querySingleSysUser(){
		HttpServletRequest req=getRequest();
		HttpSession session = req.getSession();
		int yh_id=Integer.parseInt(req.getParameter("yhId"));
		singleUserList=sysUserService.querySingleSysUser(yh_id);
		return SUCCESS;

	}
	
	//-----------------set and get-----------------------
	
	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
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

	public List getUserList() {
		return userList;
	}

	public void setUserList(List userList) {
		this.userList = userList;
	}

	public List getSingleUserList() {
		return singleUserList;
	}

	public void setSingleUserList(List singleUserList) {
		this.singleUserList = singleUserList;
	}
	
}

