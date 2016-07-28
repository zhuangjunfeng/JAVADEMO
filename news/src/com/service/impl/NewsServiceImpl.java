package com.service.impl;

import java.util.List;

import com.dao.NewsDao;
import com.model.News;
import com.service.NewsService;

public class NewsServiceImpl implements NewsService
{	
	private  NewsDao newsDao;
	public   boolean addNews(News news)
	{
		return newsDao.addNews(news);
	}
	
	
	public boolean delNews(News news) 
	{
		try {
			newsDao.delNews(news);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateNews(News news) 
	{
		return newsDao.updateNews(news);
	}

	public List<News> queryNews( ) 
	{
		return newsDao.queryNews();
	}

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
