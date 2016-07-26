package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.model.News;
import com.service.NewsService;
import com.util.BaseAction;
@SuppressWarnings("rawtypes")
public class NewsAction extends BaseAction
{
	private static final long serialVersionUID = 1L;
	public  News news;
	public NewsService newsService;
	public int AnewsId;
	private String msg;
	private int totalRecords;

	public List NewsList;
	
	/**
	 * 添加新闻json方式
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String addNews(){
		HttpServletRequest req = getRequest();
		String newsType = req.getParameter("newsType");
		String newsTitle = req.getParameter("newsTitle");
		String newsContent = req.getParameter("newsContent");
		String newsAuthor=req.getParameter("newsAuthor");
		String editorTime=req.getParameter("editorTime");
	

		news = new News();	
		news.setNewsType(newsType);
		news.setNewsTitle(newsTitle);
		news.setNewsContent(newsContent);
		news.setEditorTime(editorTime);
		news.setNewsAuthor(newsAuthor);

		Boolean res =newsService.addNews(news);
		if (res) {
			
			NewsList = new ArrayList();
			NewsList.add(news);
			return SUCCESS;
		} else {
			return null;
		}
	}
	/**
	 * 添加新闻JSP方式
	 * @return
	 */
	@SuppressWarnings("unchecked")
//	public String addNews() {
//		Boolean res =newsService.addNews(news);
//		if (res) {
//			NewsList = new ArrayList();
//			NewsList.add(news);
//			return SUCCESS;
//		} else {
//			return ERROR;
//		}
//		news.setNewsType("娛樂新聞");
//		return SUCCESS;
//	}
	
	/**
	 * 删除新闻JSP方式
	 * @return
	 */
	public String delNews() 
	{
		HttpServletRequest req = getRequest();
		String newsId=req.getParameter("newsId");
		int NewsId=Integer.parseInt(newsId);
		if(NewsId!=0)
		{
			News NewsObj=new News();
			NewsObj.setNewsId(NewsId);
		
			if (newsService.delNews(NewsObj)) 
			{
				msg = "success";
				return SUCCESS;
			} 
			else 
			{
				msg = "error_sys";
				return ERROR;
			}
		}
		else
		{
			msg = "error_none";
			return ERROR;
		}
		
		
	}
	/**
	 * 
	 * @decription：更新新闻JSP形式.
	 * @date 2016-7-18上午10:51:03
	 * @author：zhuangjf
	 */
	@SuppressWarnings("unused")
	public String updateNews() 
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		if (newsService.updateNews(news))
			{
				msg="success";
				return SUCCESS;
			}
		else
			{
				msg="error";
				return ERROR;
			}		
		
	}
	
	/**
	 * 
	 * @decription：查询所有新闻JSP方式
	 * @date 2016-7-18下午12:04:48
	 * @author：zhuangjf
	 */
	@SuppressWarnings("unused")
	public String queryNews()
	{
		HttpServletRequest req = getRequest();
		HttpSession session = req.getSession();
		NewsList = new ArrayList();
		NewsList = newsService.queryNews();
			
		return SUCCESS;
	}
	
	//-----------------set and get-----------------------
	public News getNews() {
		return news;
	}
	public void setNews(News news) {
		this.news = news;
	}
	
	public NewsService getNewsService() {
		return newsService;
	}
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
