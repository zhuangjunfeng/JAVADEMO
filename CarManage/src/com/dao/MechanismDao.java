package com.dao;

import java.util.List;

import com.model.Mechanism;
/**
 * 
 * @describtion：机构模块dao接口
 * @author :zhuangjf
 * @date:下午12:49:14
 */
public interface MechanismDao {
	/**
	 * @decription：添加机构
	 * @date 2016-8-9下午12:49:30
	 * @author：zhuangjf
	 */
	public   boolean addMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：删除机构
	 * @date 2016-8-9下午1:29:03
	 * @author：zhuangjf
	 */
	public   boolean delMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：更新机构信息
	 * @date 2016-8-9下午1:29:15
	 * @author：zhuangjf
	 */
	public   boolean updateMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：查询全部机构
	 * @date 2016-8-9下午1:35:44
	 * @author：zhuangjf
	 */
	public List<Mechanism> queryMechanism();
}
