package com.dao;

import java.util.List;

import com.model.News;
public interface NewsDao 
{
	//增加新闻
	public boolean addNews(News news);
	//删除新闻
	public boolean delNews(News news);
	//更新新闻
	public boolean updateNews(News news);
	//查找新聞
	public News queryNews(int NewsId);

	public List<News> queryNews();

}
