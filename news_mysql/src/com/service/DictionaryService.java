package com.service;
/**
 * @decription:新闻管理字典模块Service接口
 * @author：zhuangjf
 */
import java.util.List;

import com.model.Dictionary;

public interface DictionaryService {
	/**
	 * 
	 * @decription：添加字典数据
	 * @date 2016-8-4上午12:14:55
	 * @author：zhuangjf
	 */
	public boolean addDictionary();
	/**
	 * 
	 * @decription：删除字典数据
	 * @date 2016-8-4上午12:15:08
	 * @author：zhuangjf
	 */
	public boolean delDictionary();
	/**
	 * 
	 * @decription：更新字典数据
	 * @date 2016-8-4上午12:15:21
	 * @author：zhuangjf
	 */
	public boolean updateDictionary();
	/**
	 * 
	 * @decription：查询全部字典数据
	 * @date 2016-8-4上午12:15:33
	 * @author：zhuangjf
	 */
	public List<Dictionary> queryDictionary();
}
