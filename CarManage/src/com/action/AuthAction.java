package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.Auth;
import com.service.AuthService;
import com.util.BaseAction;

@SuppressWarnings({"rawtypes","unused"})
public class AuthAction extends BaseAction{

	private static final long serialVersionUID = 6880266747883337747L;
	public Auth auth;
	public AuthService authService;
	public List authList;
	public String addAuth(){
		HttpServletRequest req = getRequest();
		String qxmc=req.getParameter("qxmc");
		String url=req.getParameter("url");
		auth.setQxmc(qxmc);
		auth.setUrl(url);
		if(authService.addAuth(auth)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	public String delAuth(){
		HttpServletRequest req = getRequest();
		long qxId=Long.parseLong(req.getParameter("qxId"));
		if(qxId!=0){
			Auth authObj=new Auth();
			authObj.setQxid(qxId);
			if(authService.delAuth(authObj)){
				return SUCCESS;
			}
			else{
				return ERROR;
			}
		}
		else{
			return ERROR;
		}
	}
	public String updateAuth(){
		HttpServletRequest req = getRequest();
		String qxmc=req.getParameter("qxmc");
		String url=req.getParameter("url");
		long qxId=Long.parseLong(req.getParameter("qxId"));
		auth.setQxmc(qxmc);
		auth.setUrl(url);
		auth.setQxid(qxId);
		if(authService.updateAuth(auth)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	public String queryAuth(){
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		authList = authService.queryAuth();
		return SUCCESS;
	}
	public Auth getAuth() {
		return auth;
	}
	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	public AuthService getAuthService() {
		return authService;
	}
	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}
	public List getAuthList() {
		return authList;
	}
	public void setAuthList(List authList) {
		this.authList = authList;
	}
}
