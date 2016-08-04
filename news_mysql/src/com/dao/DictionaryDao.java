package com.dao;
/**
 *@decription： 新闻管理字典模块dao接口
 *@author zhuangjf
 */
import java.util.List;

import com.model.Dictionary;

public interface DictionaryDao {
	/**
	 * 
	 * @decription：增加字典数据
	 * @date 2016-8-4上午12:24:52
	 * @author：zhuangjf
	 */
	public boolean addDictionary();
	/**
	 * 
	 * @decription：删除字典数据
	 * @date 2016-8-4上午12:25:04
	 * @author：zhuangjf
	 */
	public boolean delDictionary();
	/**
	 * 
	 * @decription：更新字典数据
	 * @date 2016-8-4上午12:25:14
	 * @author：zhuangjf
	 */
	public boolean updateDictionary();
	/**
	 * 
	 * @decription：查询字典数据
	 * @date 2016-8-4上午12:25:28
	 * @author：zhuangjf
	 */
	public List<Dictionary> queryDictionary();
}
