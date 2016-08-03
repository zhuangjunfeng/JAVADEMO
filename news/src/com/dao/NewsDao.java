package com.dao;
/**
 * @decription：新闻管理新闻模块dao接口
 */
import java.util.List;

import com.model.News;
public interface NewsDao 
{	
	/**
	 * 
	 * @decription：增加新闻
	 * @date 2016-8-4上午12:06:28
	 * @author：zhuangjf
	 */
	public boolean addNews(News news);
	/**
	 * 
	 * @decription：删除新闻
	 * @date 2016-8-4上午12:06:36
	 * @author：zhuangjf
	 */
	public boolean delNews(News news);
	/**
	 * 
	 * @decription：更新新闻
	 * @date 2016-8-4上午12:06:52
	 * @author：zhuangjf
	 */
	public boolean updateNews(News news);
	/**
	 * 
	 * @decription：查询全部新闻
	 * @date 2016-8-4上午12:07:05
	 * @author：zhuangjf
	 */
	public List<News> queryNews();
	/**
	 * 
	 * @decription：通过用户ID查询新闻
	 * @date 2016-8-4上午12:07:26
	 * @author：zhuangjf、
	 * @return：News
	 */
	public News queryNews(int NewsId);
	/**
	 * 
	 * @decription：通过用户Id单条查询新闻
	 * @date 2016-8-4上午12:07:59
	 * @author：zhuangjf
	 * @return：List
	 */
	@SuppressWarnings("rawtypes")
	public List querySingleNews(int news_id);

}
