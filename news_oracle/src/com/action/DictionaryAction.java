package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import com.opensymphony.xwork2.ActionContext;
import com.util.BaseAction;
import com.util.DictionaryUtil;

@SuppressWarnings("rawtypes")
public class DictionaryAction extends BaseAction {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2665103456175496403L;

	private Map application;
	public List list;
	
	/**
	 * @decription：更新application
	 * @date 2016-8-3下午11:06:56
	 * @author：zhuangjf
	 */
	public String updateData() {
		return null;
	}
	
	/**
	 * @decription：通過application查詢字典数据
	 * @date 2016-8-3下午11:11:08
	 * @author：zhuangjf
	 */
	public String queryData(){
		HttpServletRequest req = getRequest();
		String type=req.getParameter("type");
		application= ActionContext.getContext().getApplication();
		list=DictionaryUtil.queryData(type, application);		
		return SUCCESS;
	}
	
	//------------get AND set----------------/
	public Map getApplication() {
		return application;
	}
	public void setApplication(Map application) {
		this.application = application;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
