package com.service;

import java.util.List;

import com.model.Mechanism;

/**
 * @describtion：机构模块Service接口
 * @author :zhuangjf
 * @date:下午12:26:52
 */
public interface MechanismService {
	/**
	 * 
	 * @decription：增加机构
	 * @date 2016-8-9下午12:47:29
	 * @author：zhuangjf
	 */
	public   boolean addMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：删除机构
	 * @date 2016-8-9下午1:08:04
	 * @author：zhuangjf
	 */
	public   boolean delMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：更新机构信息
	 * @date 2016-8-9下午1:25:00
	 * @author：zhuangjf
	 */
	public   boolean updateMechanism(Mechanism mechanism);
	/**
	 * 
	 * @decription：查询全部机构
	 * @date 2016-8-9下午1:40:56
	 * @author：zhuangjf
	 */
	public List<Mechanism> queryMechanism();
}
