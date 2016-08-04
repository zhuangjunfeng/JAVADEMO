package com.dao.impl;
/**
 * @decription：新闻管理新闻模块dao实现类
 */
import java.util.List;

import org.hibernate.Query;

import com.dao.NewsDao;
import com.model.News;
import com.util.BasicHibernateDao;
@SuppressWarnings("unchecked")
public class NewsDaoImpl extends BasicHibernateDao implements NewsDao
{
	/**
	 * @decription：增加用户
	 * @author：zhuangjf
	 */
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
	/**
	 * @decription:删除新闻
	 * @author：zhuangjf
	 */
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
	
	/**
	 * @decription：更新新闻
	 * @author：zhuangjf
	 */
	public boolean updateNews(News news) {
		try {
			this.getSession().update(news);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * @decription：通过用户id查询新闻
	 * @author：zhuangjf
	 * @return：News
	 */
	public News queryNews(int NewsId){
		Query query = this.getSession().createQuery("from News where NewsId=?");
		query.setLong(0, NewsId);
		List<News> list = query.list();
		return list.size() == 0 ? null : list.get(0);
	}
	/**
	 * @decription：查询全部新闻
	 * @author：zhuangjf
	 */
	public List<News> queryNews()
	{
		Query query = this.getSession().createQuery("from News");
		List<News> list = query.list();
		return list;
	}

	/**
	 * @decription：通过用户id单条查询新闻
	 * @author：zhuangjf
	 */
	@SuppressWarnings("rawtypes")
	public List querySingleNews(int news_id){
		Query query = this.getSession().createQuery("from News where NewsId=?");
		query.setLong(0, news_id);
		List<News> news_list=query.list();
		return news_list;
	}

}

