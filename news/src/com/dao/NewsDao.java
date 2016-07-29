package com.dao;

import java.util.List;

import com.model.News;
public interface NewsDao 
{
	
	public boolean addNews(News news);
	
	public boolean delNews(News news);

	public boolean updateNews(News news);
	//
	public List<News> queryNews();
	public News queryNews(int NewsId);
	@SuppressWarnings("rawtypes")
	public List querySingleNews(int news_id);

}
