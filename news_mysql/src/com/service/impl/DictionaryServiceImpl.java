package com.service.impl;
/**
 * @decription:新闻管理字典模块Service实现类
 */
import java.util.List;

import com.dao.DictionaryDao;
import com.model.Dictionary;
import com.service.DictionaryService;

public class DictionaryServiceImpl implements DictionaryService{

	private DictionaryDao dictionaryDao;
	/**
	 * @decription:增加字典数据
	 * @author：zhungjf
	 */
	@Override
	public boolean addDictionary() {
		return dictionaryDao.addDictionary();
	}
	/**
	 * @decription：删除字典数据
	 * @author：zhuangjf
	 */
	@Override
	public boolean delDictionary() {
		return dictionaryDao.delDictionary();
	}
	/**
	 * @decription:更新字典数据
	 * @author：zhuangjf
	 */
	@Override
	public boolean updateDictionary() {
		return dictionaryDao.updateDictionary();
	}
	/**
	 * @decription：查询字典数据
	 * @author：zhuangjf
	 */
	@Override
	public List<Dictionary> queryDictionary() {
		return dictionaryDao.queryDictionary();
	}
	
//---------------------set AND get----------------------------------------
	public DictionaryDao getDictionaryDao() {
		return dictionaryDao;
	}

	public void setDictionaryDao(DictionaryDao dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}

}
