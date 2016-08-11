package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.SysUser;
import com.service.SysUserService;
import com.util.BaseAction;
/**
 * @describtion：用户模块Action类
 * @author :zhuangjf
 * @date:下午12:14:32
 */
@SuppressWarnings({"rawtypes","unchecked","unused"})
public class SysUserAction extends BaseAction{
	private static final long serialVersionUID = -7801360233142408970L;
	public  SysUser sysUser;
	public String usersName;
	public String password;
	public String msg;
	public List userList;
	public SysUserService sysUserService;
	public List singleUserList;
	/**
	 * 
	 * @decription：登录验证
	 * @date 2016-8-9上午11:59:55
	 * @author：zhuangjf
	 */
	public String login() 
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		String yhzh=req.getParameter("yhzh");
		String yhmm= req.getParameter("yhmm");
		if (!yhzh.equals("") && !password.equals(""))
		{
			SysUser UserRs = sysUserService.login(yhzh,yhmm);
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
	 * @decription：增加用户
	 * @date 2016-8-11下午5:57:15
	 * @author：zhuangjf
	 * @param yhxm 用户姓名 yhmm 用户密码  yhxb 用户性别 yhzh 用户账户
	 * @param yhyx 用户邮箱  yhjs 用户角色 yhgs 用户归属 sjhm 手机号码
	 */
	public String addSysUser(){
		HttpServletRequest req = getRequest();
		String yhxm = req.getParameter("yhxm");
		String yhmm= req.getParameter("yhmm");
		String yhxb = req.getParameter("yhxb");
		String yhzh=req.getParameter("yhzh");
		String yhyx=req.getParameter("yhyx");
		String yhjs=req.getParameter("yhjs");
		String yhgs=req.getParameter("yhgs");
		String sjhm=req.getParameter("sjhm");

		sysUser = new SysUser();	
		sysUser.setYhzh(yhzh);
		sysUser.setYhyx(yhyx);
		sysUser.setYhxm(yhxm);
		sysUser.setYhmm(yhmm);
		sysUser.setYhxb(yhxb);
		sysUser.setYhgs(yhgs);
		sysUser.setYhjs(yhjs);
		sysUser.setSjhm(Integer.parseInt(sjhm));

		Boolean res =sysUserService.addSysUser(sysUser);
		if (res) {
			userList.add(sysUser);
			return SUCCESS;
		} else {
			return null;
		}
	}
	/**
	 * @decription：删除用户
	 * @date 2016-8-11下午5:57:31
	 * @author：zhuangjf
	 */
	public String delSysUser() 
	{
		HttpServletRequest req = getRequest();
		String yhId=req.getParameter("yhId");
		long YhId=Long.parseLong(yhId);
		if(YhId!=0)
		{
			SysUser sysUserObj=new SysUser();
			sysUserObj.setYhid(YhId);
		
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
	 * @decription：更新用户信息
	 * @date 2016-8-11下午5:57:40
	 * @author：zhuangjf
	 * @param yhxm 用户姓名 yhmm 用户密码  yhxb 用户性别 yhzh 用户账户
	 * @param yhyx 用户邮箱  yhjs 用户角色 yhgs 用户归属 sjhm 手机号码
	 */
	public String updateSysUser(){
		HttpServletRequest req = getRequest();
		String yhxm = req.getParameter("yhxm");
		String yhmm= req.getParameter("yhmm");
		String yhxb = req.getParameter("yhxb");
		String yhzh=req.getParameter("yhzh");
		String yhyx=req.getParameter("yhyx");
		String yhjs=req.getParameter("yhjs");
		String yhgs=req.getParameter("yhgs");
		String sjhm=req.getParameter("sjhm");
		String yhId=req.getParameter("yhId");
		long YhId=Long.parseLong(yhId);

		sysUser = new SysUser();	
		sysUser.setYhzh(yhzh);
		sysUser.setYhyx(yhyx);
		sysUser.setYhxm(yhxm);
		sysUser.setYhmm(yhmm);
		sysUser.setYhxb(yhxb);
		sysUser.setYhgs(yhgs);
		sysUser.setYhjs(yhjs);
		sysUser.setSjhm(Integer.parseInt(sjhm));
		sysUser.setYhid(YhId);
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
	 * @decription：查询用户
	 * @date 2016-8-11下午5:57:51
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
	 * @decription：根据用户id查询用户
	 * @date 2016-8-11下午5:58:14
	 * @author：zhuangjf
	 */
	public String querySingleSysUser(){
		HttpServletRequest req=getRequest();
		HttpSession session = req.getSession();
		long yhid=Long.parseLong(req.getParameter("yhId"));
		singleUserList=sysUserService.querySingleSysUser(yhid);
		return SUCCESS;
	}
	
//-------------set AND get--------------//
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
