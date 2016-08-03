package com.dao.impl;
/**
 * @decription:新闻管理字典模块dao实现类
 * @author：zhuangjf
 * 
 */
import java.util.List;

import org.hibernate.Query;

import com.dao.DictionaryDao;
import com.model.Dictionary;
import com.util.BasicHibernateDao;

public class DictionaryDaoImpl extends BasicHibernateDao implements DictionaryDao {
	/**
	 * @decription:增加字典数据
	 * @author：zhuangjf
	 */
	@Override
	public boolean addDictionary() {		
		return false;
	}
	/**
	 * @decription:删除字典数据
	 * @author：zhuangjf
	 */
	@Override
	public boolean delDictionary() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	/**
	 * @decription:更新字典数据
	 * @author：zhuangjf
	 */
	public boolean updateDictionary() {
		return false;
	}
	/**
	 * @decription:查询字典数据
	 * @author：zhuangjf
	 */
	@Override
	public List<Dictionary> queryDictionary() {
		Query query = this.getSession().createQuery("from Dictionary");
		List<Dictionary> list = query.list();
		return list;
		
	}	
}
