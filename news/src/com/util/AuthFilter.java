package com.util;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.model.SysUser;

public class AuthFilter implements Filter{
	private static final Logger LOGGER = Logger.getLogger(AuthFilter.class);
	protected FilterConfig filterConfig;
	
	public void destroy() {
		filterConfig = null;
	}

	public void loginJsonPath(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		String authError = "loginError";
		arg1.setContentType("text/javascript; charset=utf-8");
		try {
			PrintWriter out = arg1.getWriter();
			out.print(authError);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loginPath(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		String loginPath = "/login.html";
		RequestDispatcher loginDispatcher = arg0.getRequestDispatcher(loginPath);
		try {
			loginDispatcher.forward(arg0, arg1);
		} catch (ServletException e) {
			LOGGER.error(e, e);
		} catch (IOException e) {
			LOGGER.error(e, e);
		}
	}
	
	public void commonPath(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		try {
			arg2.doFilter(arg0, arg1);
		} catch (IOException e) {
			LOGGER.error(e, e);
		} catch (ServletException e) {
			LOGGER.error(e, e);
		}
		return;
	}
	/**
	 * @decription：判断URL是否需要被过滤
	 * @date 2016-8-2下午7:28:06
	 * @author：zhuangjf
	 */
	public Boolean isAuth(String realUri) {
		List<String> authAll =new ArrayList<String>(); 
		authAll.add(0, "system/.*");
		Boolean rs = false;
		for (int i = 0; i < authAll.size(); i++) {
			if (realUri.matches(authAll.get(i))) {
				LOGGER.info(realUri+"被监听");
				rs = true;
				break;
			}
		}
		return rs;
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpSession session = req.getSession();
		String uri = req.getRequestURI();
		int length = req.getContextPath().length();
		String realUri = uri.substring(length+1, uri.length());
		
		String accept=req.getHeader("Accept");
		
		if (isAuth(realUri)&&realUri.indexOf("login.shtml")==-1) {
			
			SysUser sysUser = null;
			sysUser = (SysUser) session.getAttribute("User");
			if (sysUser == null) {	
				if(accept.indexOf("application/json")>-1){
					loginJsonPath(arg0, arg1, arg2);
				}else{
					loginPath(arg0, arg1, arg2);
				}
			}else{
				commonPath(arg0, arg1, arg2);
				return;
			}
		} else {
			commonPath(arg0, arg1, arg2);
			return;
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}
}
