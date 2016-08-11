package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.Mechanism;
import com.service.MechanismService;
import com.util.BaseAction;

/**
 * @describtion：机构模块Action类
 * @author :zhuangjf
 * @date:下午12:21:50
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class MechanismAcion extends BaseAction{
	private static final long serialVersionUID = -8012335180676685723L;
	public Mechanism mechanism;
	public MechanismService mechanismService;
	public List MechanismList;
	public String msg;
	
	/**
	 * @decription：添加机构
	 * @date 2016-8-9下午12:22:40
	 * @author：zhuangjf
	 */
	public String addMechanism(){
		HttpServletRequest req=getRequest();
		String jgmc=req.getParameter("jgmc");
		String jglx=req.getParameter("jglx");
		String jgdz=req.getParameter("jgdz");
		String qxdj=req.getParameter("qxdj");
		String jgsd=req.getParameter("jgsd");
		int ygrs= Integer.parseInt(req.getParameter("ygrs"));
		mechanism=new Mechanism();
		mechanism.setJgmc(jgmc);
		mechanism.setJglx(jglx);
		mechanism.setJgdz(jgdz);
		mechanism.setQxdj(qxdj);
		mechanism.setJgsd(jgsd);
		mechanism.setYgrs(ygrs);
		Boolean res =mechanismService.addMechanism(mechanism);
		if (res){
			MechanismList= new ArrayList();
			MechanismList.add(mechanism);
			return SUCCESS;
		}
		else{
		return null;
		}
	}
	/**
	 * @decription：删除机构
	 * @date 2016-8-9下午12:22:48
	 * @author：zhuangjf
	 */
	public String delMechanism(){
		HttpServletRequest req = getRequest();
		int jgId= Integer.parseInt(req.getParameter("jgId"));
		if(jgId!=0){
			Mechanism mechanismObj=new Mechanism ();
			mechanismObj.setJgid(jgId);
			if(mechanismService.delMechanism(mechanismObj)){
			return SUCCESS;
			}
		}
		return null;
	}
	/**
	 * @decription：更新机构
	 * @date 2016-8-9下午12:23:04
	 * @author：zhuangjf
	 */
	public String updateMechanism(){
		HttpServletRequest req=getRequest();
		String jgmc=req.getParameter("jgmc");
		String jglx=req.getParameter("jglx");
		String jgdz=req.getParameter("jgdz");
		String qxdj=req.getParameter("qxdj");
		String jgsd=req.getParameter("jgsd");
		int ygrs= Integer.parseInt(req.getParameter("ygrs"));
		int jgId= Integer.parseInt(req.getParameter("jgId"));
		mechanism=new Mechanism();
		mechanism.setJgmc(jgmc);
		mechanism.setJglx(jglx);
		mechanism.setJgdz(jgdz);
		mechanism.setQxdj(qxdj);
		mechanism.setJgsd(jgsd);
		mechanism.setYgrs(ygrs);
		mechanism.setJgid(jgId);
		if(mechanismService.updateMechanism(mechanism)){
			msg="success";
			return SUCCESS;
			}
		else{
			msg="error";
			return ERROR;	
		}
	}
	/**
	 * @decription：查询全部机构
	 * @date 2016-8-9下午12:23:14
	 * @author：zhuangjf
	 */
	@SuppressWarnings("unused")
	public String queryMechanism(){
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		MechanismList = mechanismService.queryMechanism();
		return SUCCESS;
	}
	//------------set AND get---------------//
	public Mechanism getMechanism() {
		return mechanism;
	}
	public void setMechanism(Mechanism mechanism) {
		this.mechanism = mechanism;
	}
	public MechanismService getMechanismService() {
		return mechanismService;
	}
	public void setMechanismService(MechanismService mechanismService) {
		this.mechanismService = mechanismService;
	}
	public List getMechanismList() {
		return MechanismList;
	}
	public void setMechanismList(List mechanismList) {
		MechanismList = mechanismList;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
