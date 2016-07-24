package com.dao.impl;

import java.util.List;

import org.hibernate.Query;


import com.dao.NewsDao;
import com.model.News;
import com.util.BasicHibernateDao;
@SuppressWarnings("unchecked")
public class NewsDaoImpl extends BasicHibernateDao implements NewsDao
{
	//增加新闻
	public boolean addNews(News news)
	{
		try {
			this.getSession().save(news);
        } catch (Exception e) 
        {
        	e.printStackTrace();
	        return false;
        }
		return true;
	}
	//删除新闻
	public boolean delNews(News news)
	{
			try {
				this.getSession().delete(news);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
	}
	
	//更新新闻
	public boolean updateNews(News news) {
		try {
			this.getSession().update(news);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 */
	public News queryNews(int NewsId){
		Query query = this.getSession().createQuery("from News where NewsId=?");
		query.setLong(0, NewsId);
		List<News> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
	
	
	public List<News> queryNews()
	{
		Query query = this.getSession().createQuery("from News");
		List<News> list = query.list();
		return list;
	}
	
}

