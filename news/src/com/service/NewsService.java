package com.service;
/**
 * @decription:新闻管理新闻模块Service接口
 */
import java.util.List;

import com.model.News;

public interface NewsService 
{	
	/**
	 * 
	 * @decription：增加新闻
	 * @date 2016-8-3下午11:57:43
	 * @author：zhuangjf
	 */
	public   boolean addNews(News news);
	/**
	 * 
	 * @decription：删除新闻
	 * @date 2016-8-3下午11:57:56
	 * @author：zhuangjf
	 */
	public boolean delNews(News news);
	/**
	 * 
	 * @decription:更新新闻
	 * @date 2016-8-3下午11:58:04
	 * @author：zhuangjf
	 */
	public boolean updateNews(News news);
	/**
	 * 、
	 * @decription：查询全部新闻
	 * @date 2016-8-3下午11:58:17
	 * @author：zhuangjf
	 */
	public List<News> queryNews();
	/**
	 * 
	 * @decription：通过新闻Id单条查询新闻
	 * @date 2016-8-3下午11:58:28
	 * @author：zhuangjf
	 * @param：new_id 新闻Id	
	 */
	@SuppressWarnings("rawtypes")
	public List querySingleNews(Integer news_id);
}
