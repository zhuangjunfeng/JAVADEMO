package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.Menu;
import com.service.MenuService;
import com.util.BaseAction;

@SuppressWarnings({"rawtypes","unused"})
public class MenuAction extends BaseAction{
	private static final long serialVersionUID = -5134604174419346389L;
	public Menu menu;
	public MenuService menuService;
	public List menuList;
	
	public String addMenu(){
		HttpServletRequest req=getRequest();
		String cdmc=req.getParameter("cdmc");
		String sffj=req.getParameter("sffj");
		String sfzj=req.getParameter("sfzj");
		String url=req.getParameter("url");
		menu.setCdmc(cdmc);
		menu.setSffj(sffj);
		menu.setSfzj(sfzj);
		menu.setUrl(url);
		if(menuService.addMenu(menu)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	public String delMenu(){
		HttpServletRequest req=getRequest();
		long cdId=Long.parseLong(req.getParameter("cdId"));
		if(cdId!=0){
			Menu menuObj=new Menu();
			menuObj.setCdid(cdId);
			if(menuService.delMenu(menuObj)){
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
	public String updateMenu(){
		HttpServletRequest req=getRequest();
		String cdmc=req.getParameter("cdmc");
		String sffj=req.getParameter("sffj");
		String sfzj=req.getParameter("sfzj");
		String url=req.getParameter("url");
		
		long cdId=Long.parseLong(req.getParameter("cdId"));
		menu.setCdmc(cdmc);
		menu.setSffj(sffj);
		menu.setSfzj(sfzj);
		menu.setUrl(url);
		menu.setCdid(cdId);
		if(menuService.updateMenu(menu)){
			return SUCCESS;
		}
		else{
			return ERROR;
		}

	}
	public String queryMenu(){
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		menuList=menuService.queryMenu();
		return SUCCESS;
	}
	//-----------set AND get------------------//
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public MenuService getMenuService() {
		return menuService;
	}
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	public List getMenuList() {
		return menuList;
	}
	public void setMenuList(List menuList) {
		this.menuList = menuList;
	}
	
}
