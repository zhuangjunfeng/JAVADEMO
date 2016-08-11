package com.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

	

import com.model.Role;
import com.service.RoleService;
import com.util.BaseAction;
/**
 * @describtion：角色模块Action类
 * @author :zhuangjf
 * @date:下午6:56:26
 */
@SuppressWarnings({"rawtypes","unchecked","unused"})
public class RoleAction extends BaseAction {
	private static final long serialVersionUID = 2719738272638816269L;
	public Role role;
	public RoleService roleService;
	public List roleList;
	public List singleRoleList;
	public String msg;
	/**
	 * @decription：增加角色
	 * @date 2016-8-11下午6:56:47
	 * @author：zhuangjf
	 */
	public String addRole(){
		HttpServletRequest req = getRequest();
		String jsmc = req.getParameter("jsmc");
		role.setJsmc(jsmc);
		boolean res=roleService.addRole(role);
		if(res){
			roleList.add(role);
			return SUCCESS;
		} 
		else{
			return ERROR;
		}
	}
	/**
	 * @decription：删除角色
	 * @date 2016-8-11下午6:57:00
	 * @author：zhuangjf
	 */
	public String delRole(){
		HttpServletRequest req = getRequest();
		long jsId=Long.parseLong(req.getParameter("jsId"));
		if(jsId!=0){
		Role roleObj=new Role();
		roleObj.setJsid(jsId);
		if(roleService.delRole(roleObj)){
			msg = "success";
			return SUCCESS;
		}
		else{
			msg = "error_sys";
			return ERROR;
		}
		}
		else{
			return ERROR;
		}
	}
	/**
	 * @decription：更新角色
	 * @date 2016-8-11下午6:57:12
	 * @author：zhuangjf
	 */
	public String updateRole(){
		HttpServletRequest req = getRequest();
		String jsmc = req.getParameter("jsmc");
		long jsId=Long.parseLong(req.getParameter("jsId"));
		role.setJsmc(jsmc);
		role.setJsid(jsId);
		if(roleService.updateRole(role)){
			msg = "success";
			return SUCCESS;
		}
		else{
			msg = "error_sys";
			return ERROR;
		}
		}
	/**
	 * @decription：查询角色
	 * @date 2016-8-11下午6:57:21
	 * @author：zhuangjf
	 */
	public String queryRole(){
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		roleList = roleService.queryRole();
		return SUCCESS;
	}
	/**
	 * @decription：根据ID查询角色
	 * @date 2016-8-11下午7:04:09
	 * @author：zhuangjf
	 */
	public String querySingleRole(){
		HttpServletRequest req = getRequest();
		long jsId=Long.parseLong(req.getParameter("jsId"));
		singleRoleList=roleService.querySingleRole(jsId);
		return null;
	}
	//-----------set AND get---------------//
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	public List getRoleList() {
		return roleList;
	}
	public void setRoleList(List roleList) {
		this.roleList = roleList;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
