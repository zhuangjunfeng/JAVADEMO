package com.service.impl;

import java.util.List;

import com.dao.MechanismDao;
import com.model.Mechanism;
import com.service.MechanismService;
/**
 * 
 * @describtion：机构模块Service实现类
 * @author :zhuangjf
 * @date:下午12:47:46
 */
public class MechanismServiceImpl implements MechanismService {
	private MechanismDao mechanismDao;
	/**
	 * @deprecation：增加机构
	 * @author：zhuangjf
	 */
	public   boolean addMechanism(Mechanism mechanism){
		return mechanismDao.addMechanism(mechanism);
	}
	/**
	 * @deprecation：删除机构
	 * @author：zhuangjf
	 */
	public   boolean delMechanism(Mechanism mechanism ){
		try {
			 mechanismDao.delMechanism(mechanism);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @deprecation:更新机构
	 * @author：zhuangjf
	 */
	public   boolean updateMechanism(Mechanism mechanism){
		return	mechanismDao.updateMechanism(mechanism);
	}
	/**
	 * 
	 * @decription：查询全部机构
	 * @date 2016-8-9下午1:34:07
	 * @author：zhuangjf
	 */
	public List<Mechanism> queryMechanism(){
		return mechanismDao.queryMechanism();
	}
	//--------------set AND get-------------//
	public MechanismDao getMechanismDao() {
		return mechanismDao;
	}
	public void setMechanismDao(MechanismDao mechanismDao) {
		this.mechanismDao = mechanismDao;
	}
	
}
