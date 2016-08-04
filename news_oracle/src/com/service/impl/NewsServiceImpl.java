package com.service.impl;
/**
 * @decription：新闻管理新闻模块Service实现类
 */
import java.util.List;

import com.dao.NewsDao;
import com.model.News;
import com.service.NewsService;

public class NewsServiceImpl implements NewsService
{	
	private  NewsDao newsDao;
	/**
	 * @decription:增加用户
	 * @author：zhuangjf
	 */
	public   boolean addNews(News news)
	{
		return newsDao.addNews(news);
	}
	/**
	 * @decription：删除用户
	 * @author：zhuangjf
	 */
	public boolean delNews(News news) 
	{
		try {
			newsDao.delNews(news);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * @decription:更新用户
	 * @author：zhuangjf
	 */
	public boolean updateNews(News news) 
	{
		return newsDao.updateNews(news);
	}
	/**
	 * @decription:查询全部新闻
	 * @author：zhuangjf
	 */
	public List<News> queryNews( ) 
	{
		return newsDao.queryNews();
	}
	/**
	 * @decription：通过用户Id单条查询新闻
	 * @author：zhuangjf
	 */
	@SuppressWarnings("rawtypes")
	public List querySingleNews(Integer news_id){
		return newsDao.querySingleNews(news_id);
	}
		
	//-----------------set and get-----------------------
	public NewsDao getNewsDao() {
		return newsDao;
	}


	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

}
