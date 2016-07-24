package com.service;

import java.util.List;

import com.model.News;

public interface NewsService 
{	
	public   boolean addNews(News news);
	public boolean delNews(News news);
	public boolean updateNews(News news);
	public List<News> queryNews();
}
