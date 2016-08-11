package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.MechanismDao;
import com.model.Mechanism;
import com.util.BasicHibernateDao;
/**
 * 
 * @describtion：机构模块dao实现类
 * @author :zhuangjf
 * @date:下午12:49:53
 */
@SuppressWarnings("unchecked")
public class MechanismDaoImpl extends BasicHibernateDao implements MechanismDao {
	/**
	 * @deprecation：增加机构
	 * @author：zhuangjf
	 */
	public   boolean addMechanism(Mechanism mechanism){
		try {
			this.getSession().save(mechanism);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	/**
	 * @deprecation:删除机构
	 * @author：zhuangjf
	 */
	public   boolean delMechanism(Mechanism mechanism){
		try {
			this.getSession().delete(mechanism);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * @deprecation：更新机构信息
	 * @author：zhuangjf
	 */
	public   boolean updateMechanism(Mechanism mechanism){
		try {
			this.getSession().update(mechanism);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	/**
	 * @deprecation:查询全部机构
	 * @author：zhuangjf
	 */
	public List<Mechanism> queryMechanism(){
		Query query = this.getSession().createQuery("from Mechanism");
		List<Mechanism> list = query.list();
		return list;
	}
}
